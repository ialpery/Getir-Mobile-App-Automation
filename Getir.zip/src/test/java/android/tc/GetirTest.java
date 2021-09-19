package android.tc;

import Base.AppFactory;
import android.po.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class GetirTest {

    @BeforeTest
    public void setUp() throws MalformedURLException {
        AppFactory.androidLaunch();

    }

    @Test
    public void case1 () throws IOException, InterruptedException {

        BasePage basePage = new BasePage();
        Thread.sleep(5000);
        basePage.onBoarding1.click();
        basePage.onBoarding2.click();
        basePage.onBoarding3.click();
        basePage.gotItButton.click();
        Assert.assertEquals(basePage.anasayfaBaslik.getText(),"GetirSample");
        basePage.waterCategory.click();
        basePage.firstProduct.click();
        basePage.buyNow.click();
        Assert.assertEquals(basePage.price.getText(),"$1,98");
        basePage.removeButton.click();

    }

    @Test
    public void case2 () throws InterruptedException {

        BasePage basePage = new BasePage();
        Thread.sleep(5000);
        basePage.onBoarding1.click();
        basePage.onBoarding2.click();
        basePage.onBoarding3.click();
        basePage.gotItButton.click();
        Assert.assertEquals(basePage.anasayfaBaslik.getText(),"GetirSample");
        basePage.menu.click();
        basePage.babyCare.click();
        basePage.product3.click();
        Assert.assertEquals(basePage.price,"$1,98");


    }

    /* case 3

    --The heart icon of the product added to the favorites is not "isclicked".
    --When I click on the image detail while in the product detail, a different picture appears.



     */


    @AfterTest
    public void cakeClose(){
        AppFactory.closeApp();
    }
}
