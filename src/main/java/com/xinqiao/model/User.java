package com.xinqiao.model;

public class User {
	
	private Integer id;
	private String username;
	private String pwd;
	private Integer age;
	
	public User(String username,String pwd){
		this.username=username;
		this.pwd= pwd;
	}
	
	
	public String getUsername() {
		return username;//
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
