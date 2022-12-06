package com.tutorialninja.testsuite;

import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {

    MyAccountPage myAccountPage=new MyAccountPage();

@Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
    myAccountPage.clickonMyAccount();
    myAccountPage.selectMyAccountOptions("Register");
    Assert.assertEquals(myAccountPage.verifyRegisterText(),"Register");
}
@Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
    myAccountPage.clickonMyAccount();
    myAccountPage.selectMyAccountOptions("Login");
    Assert.assertEquals(myAccountPage.verifyReturningText(),"Returning Customer");
}
@Test
    public void verifyThatUserRegisterAccountSuccessfully(){
    myAccountPage.clickonMyAccount();
    myAccountPage.selectMyAccountOptions("Register");
    myAccountPage.enterFirstName("Prime");
    myAccountPage.enterLastName("Testing");
    myAccountPage.enterEmailAddress("Prime"+getAlphaNumericString(4)+"@gmail.com");
    myAccountPage.enterPhoneNumber("07896586958");
    myAccountPage.enterPassword("test123");
    myAccountPage.enterConfirmPassword("test123");
    myAccountPage.clickOnNewsLetterButton();
    myAccountPage.clickOnPrivacyPolicy();
    myAccountPage.clickOnContinue1();
    Assert.assertEquals(myAccountPage.verifyMessageYourAccount(),"Your Account Has Been Created!");
    myAccountPage.clickOnContinue3();
    myAccountPage.clickOnMyAccountLink();
    myAccountPage.selectMyAccountOptions("Logout");
    Assert.assertEquals(myAccountPage.verifyLogoutText(),"Account Logout");
    myAccountPage.clickOnContinue4();



}

}
