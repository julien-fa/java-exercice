package orsys.atelier.exercices.serialisation;

import java.io.Serializable;

public class Config implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6143239380002133859L;

	private String urlJdbc;
	
	private String config;
	
	private String user;
	
	private String pwd;
	
	
	public Config(String urlJdbc, String config, String user, String pwd) {
		super();
		this.urlJdbc = urlJdbc;
		this.config = config;
		this.user = user;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.config + " " + this.user + " " + this.urlJdbc + " " + this.pwd;
	}

	public String getUrlJdbc() {
		return urlJdbc;
	}

	public void setUrlJdbc(String urlJdbc) {
		this.urlJdbc = urlJdbc;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
