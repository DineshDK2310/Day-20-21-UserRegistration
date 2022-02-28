package com.bridgelab.userregistrationjunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	private UserRegistration  userRegistration;

	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstNameHappy() {
		boolean result = userRegistration.firstName("Rash");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstNameSad() {
		boolean result = userRegistration.firstName("rash");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastNameHappy() {
		boolean result = userRegistration.lastName("Gajra");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastNameSad() {
		boolean result = userRegistration.lastName("gajra");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNoHappy() {
		boolean result = userRegistration.mobileNumberValidate("91 9876543210");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNoSad() {
		boolean result = userRegistration.mobileNumberValidate("98745203612");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailHappy() {
		boolean result = userRegistration.isValidEmail("abc@gmail.com");
		Assert.assertTrue(result);
	}
	@Test
	public void givenEmailSad() {
		boolean result = userRegistration.isValidEmail("abc.@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordOneHappy() {
		boolean result = userRegistration.passwordOneValidate("abcdbd27");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordOneSad() {
		boolean result = userRegistration.passwordOneValidate("hnrgsh");
		Assert.assertFalse(result);
	}
	
	@Test
    public void givenPasswordTwoHappy() {
        boolean result = userRegistration.passwordTwoValidate("Hashsnjd");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordTwoSad() {
        boolean result = userRegistration.passwordTwoValidate("mjdnfkm");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenPasswordThreeHappy() {
        boolean result = userRegistration.passwordThreeValidate("mdk1Hdmdd");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordThreeSad() {
        boolean result = userRegistration.passwordThreeValidate("dhjnGkd");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenPasswordFourHappy() {
        boolean result = userRegistration.passwordFourValidate("H27@jkih");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordFourSad() {
        boolean result = userRegistration.passwordFourValidate("dnbkjcf");
        Assert.assertFalse(result);
    }
    
}
