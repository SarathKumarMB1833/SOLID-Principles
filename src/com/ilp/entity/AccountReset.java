package com.ilp.entity;

import com.ilp.interfaces.AccountAttributes;
import com.ilp.interfaces.EmailReset;
import com.ilp.interfaces.PasswordReset;

public class AccountReset implements PasswordReset, EmailReset {
    private final AccountAttributes account;

    public AccountReset(AccountAttributes account) {
        this.account = account;
        System.out.println("\nYour current email is " + account.getEmail());
        }

    @Override
    public void resetEmail(String newEmail) {
        account.setEmail(newEmail);
        System.out.println("Email reset successful. New email: " + newEmail);
    }

    @Override
    public void resetPassword(String newPassword) {
        account.setPassword(newPassword);
        System.out.println("Password reset successful.");
        
    }

	public AccountAttributes getAccount() {
		return account;
	}
}


