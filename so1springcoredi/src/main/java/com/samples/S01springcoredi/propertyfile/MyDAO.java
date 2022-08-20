package com.samples.S01springcoredi.propertyfile;

public class MyDAO {
	
	private String dbserver;
	
	private String dbPort;
	private String dbUser;
	private String dbpassword;
	public MyDAO(String dbserver, String dbPort, String dbUser, String dbpassword) {
		super();
		this.dbserver = dbserver;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbpassword = dbpassword;
	}
	@Override
	public String toString() {
		return "MyDAO [dbserver=" + dbserver + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbpassword="
				+ dbpassword + "]";
	}
	
	

	
	
}
