package code.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL; 

/**
 *
 * @author MKS
 */
public class SMSAPIJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            URL url = new URL("https://smsapi.engineeringtgr.com/send/?Mobile=9958385230&Password=24072211&Message=test&To=8586055448&Key=xorasR2MjQidYXH70mbr18GygVh5u");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            String response="";
            while ((i = stream.read()) != -1) {
                response+=(char)i;
            }
            if(response.contains("success")){
                System.out.println("Successfully send SMS");
                //your code when message send success
            }else{
                System.out.println(response);
                //your code when message not send
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
