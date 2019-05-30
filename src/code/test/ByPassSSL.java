package code.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class ByPassSSL {

    public static void main(String[] args) {
        new ByPassSSL().callAPI();
    }

    private void callAPI() {
        String httpsUrl = "https://shramsuvidha.gov.in/";
        try {
            // Create a context that doesn’t check certificates.
            SSLContext sslContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManager = getTrustManager();
            sslContext.init(null, trustManager, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            URL url = new URL(httpsUrl);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            //set Method Here
            connection.setRequestMethod("PUT");
            // Guard against "bad hostname" errors during handshake.
            connection.setHostnameVerifier(new HostnameVerifier() {
                public boolean verify(String host, SSLSession sess) {
                    if (host.equals("localhost"))
                        return true;
                    else
                        return false;
                }
            });
            //Certificate Information
            printCertificateInfo(connection);
            //prepare response
            prepareResponse(connection);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    private TrustManager[] getTrustManager() {
        TrustManager[] certs = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String t) {
            }
            public void checkServerTrusted(X509Certificate[] certs, String t) {
            }
        }
        };
        return certs;
    }

    private void printCertificateInfo(HttpsURLConnection connection) {
        if (connection != null) {
            try {
                System.out.println("Response Code : " + connection.getResponseCode());
                Certificate[] certs = connection.getServerCertificates();
                for (Certificate cert : certs) {
                    System.out.println("Cert Type : " + cert.getType());
                    System.out.println("Cert Hash Code : " + cert.hashCode());
                    System.out.println("Cert Public Key Algorithm : " + cert.getPublicKey().getAlgorithm());
                    System.out.println("Cert Public Key Format : " + cert.getPublicKey().getFormat());
                }
            } catch (SSLPeerUnverifiedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void prepareResponse(HttpsURLConnection connection) throws IllegalStateException, IOException {
        if(connection != null) {
            System.out.println("*******Here we prepare Response*******");
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            String output;
            while ((output = bufferReader.readLine()) != null) {
                System.out.println(output);
            }
            bufferReader.close();
        }
    }
}