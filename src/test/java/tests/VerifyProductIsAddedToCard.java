package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.MainPage;

public class VerifyProductIsAddedToCard extends MainPage {


    @Test
    public void testAdditionProductToCard() {
        BasketPage basketPage =  new MainPage()
                .openHomePage()
                .addProductToCard()
                .closePopUpWindow()
                .goToTheCardPage();
        //    .initiateOrder("Оформить заказ");
        Assert.assertTrue(basketPage.isElementAddedOnTheBasketPage());


    }
}
