package com.mnassa.tests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.URL;

import static java.lang.Thread.sleep;

/**
 * Created by dmyv on 12/11/16.
 */
public class BaseTest {

    public static AppiumDriver driver;

    @BeforeSuite
    public void setUp() throws Exception {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File("/Users/dmyv/Downloads/AppAndroid");
        File app = new File(appDir, "app-master-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Xperia");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.mnassa");
        capabilities.setCapability("appActivity", "com.mnassa.ui.activity.LauncherActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

//    @AfterSuite
//    public void tearDown() {
//        driver.quit();
//    }
}




//        // Using Touch Action Classes
//        TouchAction tAction=new TouchAction(driver);
//        int startx = driver.findElement(By.name("Newsfeed")).getLocation().getX();
//        int starty = driver.findElement(By.name("Newsfeed")).getLocation().getY();
//        int endx = driver.findElement(By.name("Log Out")).getLocation().getX();
//        int endy = driver.findElement(By.name("Log Out")).getLocation().getY();
//        System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " +	endy);
//
//        //First tap on the screen and swipe it right using moveTo function
//        tAction.press(startx+20,starty+20).moveTo(endx+20,endy+20).release().perform();
//        Thread.sleep(1000);
//
//        //Second tap on the screen and swipe it left using moveTo function
//        tAction.press(endx+20,endy+20).moveTo(startx+20,starty+20).release().perform();
//        Thread.sleep(1000);

        // WebElement LogOutButton = driver.findElement (By.id("com.mnassa:id/design_menu_item_text")).findElement(By.linkText("Log Out"));
        // WebElement LogOutButton = driver.findElement (By.xpath("//android.widget.CheckedTextView[contains(text(),'Log Out')]"));
//      WebElement LogOutButton = driver.findElement (By.xpath("//android.widget.CheckedTextView[text()='Log Out']"));
        //driver.findElement(By.id("com.mnassa:id/logout")).click();
