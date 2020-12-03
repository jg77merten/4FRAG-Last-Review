package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketPage extends MainPage {

    private static final String SET_UP_ORDER_XPATH = "//a[text()='%s']";

    public boolean isBasketPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Корзина пуста')]"));
    }

    public BasketPage initiateOrder(String linkText) {
        WebElement buyButton = waitForExpectedElement(By.xpath(String.format(SET_UP_ORDER_XPATH, linkText)));
        buyButton.click();
        return this;

    }

        public boolean isElementAddedOnTheBasketPage() {
            return isElementDisplayed(By.xpath("//table[contains(@id, 'page-cart-table-responsive')]//tbody//tr//td"));
    }
}

