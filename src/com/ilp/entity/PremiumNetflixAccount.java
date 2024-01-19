package com.ilp.entity;

public class PremiumNetflixAccount extends NetflixAccount {
    public PremiumNetflixAccount(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}

	private boolean isPremium;

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
}
