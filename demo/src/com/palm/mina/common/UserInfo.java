package com.palm.mina.common;

import java.io.Serializable;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 3710462781617518258L;
	private String username;
	private String password;

	public UserInfo(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
