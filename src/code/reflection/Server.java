package code.reflection;

public class Server {
	
	private Integer port;
	private String serverName;
	private String servertype;
	
	
	
	public Server() {
		System.out.println("Sever Object created...");
	}
	
	public Server(Integer port, String serverName, String servertype) {
		super();
		this.port = port;
		this.serverName = serverName;
		this.servertype = servertype;
	}
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServertype() {
		return servertype;
	}
	public void setServertype(String servertype) {
		this.servertype = servertype;
	}
	
	
	
	

}
