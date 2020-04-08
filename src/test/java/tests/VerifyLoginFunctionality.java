package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PersonalAreaPage;


public class VerifyLoginFunctionality extends MainPage {


    @Test
    public void testLoginOption() {
        PersonalAreaPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage()
                .fillOutEmailField()
                .fillOutPasswordField();
        Assert.assertTrue(loginPage.isPersonalPageHeaderDisplayed());
    }
}
