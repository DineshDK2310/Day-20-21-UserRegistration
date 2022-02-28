package com.bridgelab.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTryCatchTest {
	UserRegistrationTryCatch userRegistration = new UserRegistrationTryCatch();
	
	@Test
    public void givenFirstNameHappy() {
        try {
            Assert.assertTrue(userRegistration.firstName("Mohammed"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFirstNameSad() {
        try {
            Assert.assertTrue(userRegistration.firstName("mohammed"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastNameHappy() {
        try {
            Assert.assertTrue(userRegistration.lastName("Atif"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastNameSad() {
        try {
            Assert.assertTrue(userRegistration.lastName("atif"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidEmail("abc@gmail.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailSad() {
        try {
            Assert.assertTrue(userRegistration.isValidEmail("abc@gmail@.com@"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNoHappy() {
        try {
            Assert.assertTrue(userRegistration.mobileNumberValidate("91 9876543210"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNoSad() {
        try {
            Assert.assertTrue(userRegistration.mobileNumberValidate("91 20876543210"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
	public void givenPasswordOneHappy() {
		try {
			boolean result = userRegistration.passwordOneValidate("sgduf45yd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordOneSad() {
		try {
			boolean result = userRegistration.passwordOneValidate("jdvhg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordTwoHappy() {
		try {
			boolean result = userRegistration.passwordTwoValidate("xshjsGAsf");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordTwoSad() {
		try {
			boolean result = userRegistration.passwordTwoValidate("xsyfgadg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordThreeHappy() {
		try {
			boolean result = userRegistration.passwordThreeValidate("D8bhadddd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordThreeSad() {
		try {
			boolean result = userRegistration.passwordThreeValidate("Ahdfjdhjgd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}


    @Test
    public void givenPasswordFourHappy() {
        try {
            Assert.assertTrue(userRegistration.passwordFourValidate("Abcd@12efgh"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPasswordFourSad() {
        try {
            Assert.assertTrue(userRegistration.passwordFourValidate("abcdefgh"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
