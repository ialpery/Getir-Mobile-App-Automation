package android.po;

import Base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);



    }

    @FindBy(id="com.allandroidprojects.getirsample:id/btn_next\n")
    public WebElement onBoarding1;

    @FindBy(id="com.allandroidprojects.getirsample:id/btn_next\n")
    public WebElement onBoarding2;

    @FindBy(id="com.allandroidprojects.getirsample:id/btn_next\n")
    public WebElement onBoarding3;

    @FindBy(id="com.allandroidprojects.getirsample:id/btn_next\n")
    public WebElement gotItButton;

    @FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    public WebElement menu;

    @FindBy(xpath="//android.view.ViewGroup [contains(@resource-id,\"com.allandroidprojects.getirsample:id/toolbar\")]/android.widget.TextView")
    public WebElement anasayfaBaslik;

    @FindBy(xpath="//android.support.v7.app.ActionBar.Tab [contains(@content-desc,\"Water\")]")
    public WebElement waterCategory;

    @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,\"com.allandroidprojects.getirsample:id/image1\")[1]]")
    public WebElement firstProduct;

    @FindBy(xpath="//android.widget.TextView[contains(@resource-id,\"com.allandroidprojects.getirsample:id/text_action_bottom2\")]")
    public WebElement buyNow;

    @FindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,\"com.allandroidprojects.getirsample:id/layout_item_desc\")]/android.widget.TextView[3]")
    public WebElement price;

    @FindBy(id="com.allandroidprojects.getirsample:id/text_action1")
    public WebElement removeButton;

    @FindBy(xpath = "//android.widget.CheckedTextView[contains(@resource-id,\"com.allandroidprojects.getirsample:id/design_menu_item_text\")][5]")
    public WebElement babyCare;

    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,\"com.allandroidprojects.getirsample:id/image1\")][3]")
    public WebElement product3;


}
