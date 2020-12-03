package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends MainPage {

    private static final By EMAIL_FIELD = By.id("exampleInputEmail1");

    private static final By PASSWORD_FIELD = By.id("exampleInputPassword1");


    private String getParamFromProperty(String propertyName) {
        FileInputStream fis;
        Properties properties = new Properties();
        String emailFromPropertyFile = "";
        try {
            fis = new FileInputStream("./src/test/resources/application.properties");
            properties.load(fis);
            emailFromPropertyFile = properties.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return emailFromPropertyFile;
    }


    public LoginPage fillOutEmailField() {
        WebElement emailField = waitForExpectedElement(EMAIL_FIELD);
        emailField.sendKeys(getParamFromProperty("email"), Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public PersonalAreaPage fillOutPasswordField() {
        WebElement passwordField = waitForExpectedElement(PASSWORD_FIELD);
        passwordField.sendKeys(getParamFromProperty("password"), Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return new PersonalAreaPage();
    }


    public boolean isLoginPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//a[contains(text(), 'Вход')]"));
    }
}


