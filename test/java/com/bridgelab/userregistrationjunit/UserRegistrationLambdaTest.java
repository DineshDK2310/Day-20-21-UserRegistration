package com.bridgelab.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationLambdaTest {

	UserRegistrationLamda userRegistrationLamda = new UserRegistrationLamda();
	
	@Test
    public void givenFirstNameValid() {
        boolean result = userRegistrationLamda.firstName.validate("Rashmi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid() {
        boolean result = userRegistrationLamda.firstName.validate("rash");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenLastNameValid() {
        boolean result = userRegistrationLamda.lastName.validate("Gajra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid() {
        boolean result = userRegistrationLamda.lastName.validate("gajra");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNoValid() {
        boolean result = userRegistrationLamda.mobile.validate("91 9876543215");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoInValid() {
    	boolean result = userRegistrationLamda.mobile.validate("987456321091");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailValid() {
    	boolean result = userRegistrationLamda.email.validate("rash@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid() {
    	boolean result = userRegistrationLamda.email.validate("abc@#gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordValid() {
    	boolean result = userRegistrationLamda.password.validate("H@4hdgubkjn");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordInValid() {
    	boolean result = userRegistrationLamda.password.validate("69ndkHkm");
        Assert.assertFalse(result);
    }

}
