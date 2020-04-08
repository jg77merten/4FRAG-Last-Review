package pages;

import org.openqa.selenium.By;

public class ComparasionListPage extends MainPage {

    public boolean isComparasionListPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Сравнение товаров')]"));
    }



    public boolean isElementAddedInComparasionListPage() {
        return isElementDisplayed(By.xpath("//label[contains(text(), 'Товары для сравнения')]"));
    }

}
