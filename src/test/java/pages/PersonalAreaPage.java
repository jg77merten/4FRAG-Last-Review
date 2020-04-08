package pages;


import org.openqa.selenium.By;

public class PersonalAreaPage extends LoginPage {

    public boolean isPersonalPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//p[contains(text(),  'Подписка')]"));
    }
}
