package com.mnassa.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by dmyv on 12/12/16.
 */
public class LoginTest extends BaseTest {

    @BeforeMethod
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

//    @AfterMethod
//    public void tearDown() { super.tearDown();  }

}

