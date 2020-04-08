package pages;

import org.openqa.selenium.By;

public class WishListPage extends MainPage {

    public boolean isWishListPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Мои закладки')]"));
    }

    public boolean isProductIsAddedToTheWishListPage() {
        return isElementDisplayed(By.xpath("//div[contains(@class, 'item-product-inner')]"));
    }
}
