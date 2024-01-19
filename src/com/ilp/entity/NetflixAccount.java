package com.ilp.entity;

import com.ilp.interfaces.AccountAttributes;

public class NetflixAccount implements AccountAttributes {
    private String email;
    private String password;
    
	public NetflixAccount(String email, String password) {
		// TODO Auto-generated constructor stub
		this.email = email;
	    this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
}



