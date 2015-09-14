package com.zy3.sasmac.web.vo;

import java.util.Date;

public class User implements java.io.Serializable {
	private String username;
	private String password;
	private Date registerdate;
	private Date login_time;
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
	public Date getRegisterdate() {
		return registerdate;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
}