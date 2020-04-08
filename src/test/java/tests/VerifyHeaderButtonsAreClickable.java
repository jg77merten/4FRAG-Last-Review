package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class VerifyHeaderButtonsAreClickable extends MainPage {


    @Test
    public void testLoginWindowIsDisplayed() {
        LoginPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage();
        Assert.assertTrue(loginPage.isLoginPageHeaderDisplayed());
    }


    @Test
    public void testDeliveryPageIsDisplayed() {

        DeliveryPage deliveryPage = new MainPage()
                .openHomePage()
                .openDeliveryPage();
        Assert.assertTrue(deliveryPage.isDeliveryPageHeaderDisplayed());
    }

    @Test
    public void testBasketPageIsDisplayed() {

        BasketPage basketPage = new MainPage()
                .openHomePage()
                .openBasketPage();
        Assert.assertTrue(basketPage.isBasketPageHeaderDisplayed());
    }

    @Test
    public void testComparasionListPageIsDisplayed() {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .openComparasionListPage();
        Assert.assertTrue(comparasionListPage.isComparasionListPageHeaderDisplayed());
    }


    @Test
    public void testWarrantyPageIsDisplayed() {

        WarrantyPage warrantyPage = new MainPage()
                .openHomePage()
                .openWarrantyPage();
        Assert.assertTrue(warrantyPage.isWarrantyPageHeaderDisplayed());
    }


    @Test
    public void testPaymentPageIsDisplayed() {
        PaymentPage paymentPage = new MainPage()
                .openHomePage()
                .openPaymentPage();
        Assert.assertTrue(paymentPage.isPaymentPageHeaderDisplayed());

    }


    @Test
    public void testWishListPageIsDisplayed() {
        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .openProductInTheWishListPage();
        Assert.assertTrue(wishListPage.isWishListPageHeaderDisplayed());

    }

    @Test
    public void testDiscountSystemPageIsDisplayed() {
        DiscountSystemPage discountSystemPage = new MainPage()
                .openHomePage()
                .openDiscountSystemPage();
        Assert.assertTrue(discountSystemPage.isDiscountSystemPageHeaderDisplayed());

    }

    @Test
    public void testBookmarksPageIsDisplayed() {
       BookmarksPage bookmarksPage = new MainPage()
                .openHomePage()
                .openBookmarksPage();
        Assert.assertTrue(bookmarksPage.isBookmarksPageHeaderDisplayed());

    }
}






