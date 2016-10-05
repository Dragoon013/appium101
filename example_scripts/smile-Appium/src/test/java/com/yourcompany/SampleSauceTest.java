package com.yourcompany;

import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;
import com.saucelabs.testng.SauceOnDemandTestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileElement;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SampleSauceTest {

	@Test
    public static void main() throws MalformedURLException {

        //local
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "saucy2");
        capabilities.setCapability("app", "/Users/Columbia/Downloads/smile-Appium/ApiDemos-debug.apk");

        //remote
        /*        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("appActivity", ".graphics.TouchPaint");
        capabilities.setCapability("app", "https://github.com/appium/sample-code/blob/master/sample-code/apps/ApiDemos/bin/ApiDemos-debug.apk?raw=true");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.4.16");
        */
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>( new URL("http://dragoon013:98d61e8d-a05f-4581-8572-3fb129fe5e9e@ondemand.saucelabs.com:80/wd/hub"), capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        TouchAction touch = new TouchAction(driver);

        touch.press(150, 100).perform();
        touch.press(250, 100).perform();

        WebElement compassBtn = driver.findElement(By.id("android:id/text1"));
        //        assertEquals(compassBtn.clickable.value, true);

        touch.press(200, 10)
            .moveTo(1, 1)
            .moveTo(1, 1)
            .moveTo(1, 1)
            .moveTo(1, 1)
            .moveTo(1, 1)
            .moveTo(2, 1)
            .moveTo(2, 1)
            .moveTo(2, 1)
            .moveTo(2, 1)
            .moveTo(2, 1)
            .moveTo(3, 1)
            .moveTo(3, 1)
            .moveTo(3, 1)
            .moveTo(3, 1)
            .moveTo(3, 1)
            .moveTo(4, 1)
            .moveTo(4, 1)
            .moveTo(4, 1)
            .moveTo(4, 1)
            .moveTo(4, 1)
            .moveTo(5, 1)
            .moveTo(5, 1)
            .moveTo(5, 1)
            .moveTo(5, 1)
            .moveTo(5, 1)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, 0)
            .moveTo(5, -1)
            .moveTo(5, -1)
            .moveTo(5, -1)
            .moveTo(5, -1)
            .moveTo(5, -1)
            .moveTo(4, -1)
            .moveTo(4, -1)
            .moveTo(4, -1)
            .moveTo(4, -1)
            .moveTo(4, -1)
            .moveTo(3, -1)
            .moveTo(3, -1)
            .moveTo(3, -1)
            .moveTo(3, -1)
            .moveTo(3, -1)
            .moveTo(2, -1)
            .moveTo(2, -1)
            .moveTo(2, -1)
            .moveTo(2, -1)
            .moveTo(2, -1)
            .moveTo(1, -1)
            .moveTo(1, -1)
            .moveTo(1, -1)
            .moveTo(1, -1)
            .moveTo(1, -1)
            .perform();


        driver.quit();
    }
}
