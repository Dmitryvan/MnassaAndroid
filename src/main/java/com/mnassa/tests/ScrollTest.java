package com.mnassa.tests;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.title;

/**
 * Created by dmyv on 12/12/16.
 */
public class ScrollTest extends BaseTest {

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebElement find(By locator) {
        return driver.findElement(locator);
    }

    @BeforeClass
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void logInValid() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.mnassa:id/next")));

        driver.findElement(By.id("com.mnassa:id/next")).click();
        driver.findElement(By.id("com.mnassa:id/login")).click();

        // Input fields filling
        //driver.findElement(By.id("com.mnassa:id/email")).clear();
        driver.findElement(By.id("com.mnassa:id/email")).sendKeys("dmyvq@isddesign.com");

        //driver.findElement(By.id("com.mnassa:id/password")).clear();
        driver.findElement(By.id("com.mnassa:id/password")).sendKeys("9982026");

        driver.findElement(By.id("com.mnassa:id/login_button")).click();

        //Side Menu button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

        driver.findElement(By.className("android.widget.ImageButton")).click();
    }


    public static void scrollDown (String title) {

        WebElement el = find(By.className("android.widget.ImageButton"));

        int xP = el.getLocation().getX();
        int yP = el.getLocation().getY();

        int x = 0, y = 0;

        TouchAction action = new TouchAction((AndroidDriver) getDriver());

        switch (title) {
            case "1":
                x = 50;
                y = 244;
                break;
            case "2":
                x = 50;
                y = 600;
                break;
        }
        action.tap(xP + x, yP + y).release().perform();
    }

//    @AfterClass
//    public void tearDown() { super.tearDown(); }

  }