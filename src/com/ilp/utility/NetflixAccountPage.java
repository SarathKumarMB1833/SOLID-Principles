package com.ilp.utility;
import com.ilp.entity.*;
import com.ilp.interfaces.*;

public class NetflixAccountPage {

	public static void main(String[] args) {
		
		AccountAttributes netflixAccount = new NetflixAccount("abc@normal.com","password");
		AccountAttributes premiumAccount = new PremiumNetflixAccount("abc@premium.com","ppassword");
        
        AccountReset accountReset1 = new AccountReset(netflixAccount);
        accountReset1.resetEmail("abc@xyzmail.com");
        accountReset1.resetPassword("newSecurePassword456");

        AccountReset accountReset2 = new AccountReset(premiumAccount);
        accountReset2.resetEmail("xyz@abcmail.com");
        accountReset2.resetPassword("newPremiumSecurePassword789");

	}

}
