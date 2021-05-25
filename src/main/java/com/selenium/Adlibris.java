package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Adlibris {

    public void BuyBook() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.adlibris.com/se");
        WebElement s = driver.findElement(By.id("q"));
        s.sendKeys("Praktisk mjukvarutestning");
        s.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("div[class='purchase__wrapper'] a[title='Köp häftad']")).click();
        driver.findElement(By.className("material-icons__shopping_cart")).click();
        // wait for dropdown animation
        WebDriverWait w = new WebDriverWait(driver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class='cart__checkout cart__checkout--bottom btn btn--link ']")));
        driver.findElement(By.cssSelector("a[class='cart__checkout cart__checkout--bottom btn btn--link ']")).click();


    }
}
