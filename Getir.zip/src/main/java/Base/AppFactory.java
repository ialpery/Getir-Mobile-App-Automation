package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities dc;



    public static void androidLaunch() throws MalformedURLException {

        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";

        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "8.0.0");
        dc.setCapability("appPackage", "com.google.android.packageinstaller"); //check
        dc.setCapability("deviceName", "SM-G960F");
        dc.setCapability("udid","1cb44214cb0c7ece");
        dc.setCapability("noReset","true");
        dc.setCapability("automationName","UIAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL(appiumServerURL), dc);
        AppDriver.setDriver(driver);
    }

    public static void closeApp(){
        driver.quit();
    }

}
