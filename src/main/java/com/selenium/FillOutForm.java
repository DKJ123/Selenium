package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillOutForm {

    public void Form() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.actitime.com");
        driver.findElement(By.id("cookie-button--got-it")).click();
        driver.findElement(By.cssSelector("a[class='button']")).click();
        // webelements
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement company = driver.findElement(By.id("company"));

        // Javascript
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='Had to use javascript';", firstName);
        jse.executeScript("arguments[0].value='in order for this to work';", lastName);
        jse.executeScript("arguments[0].value='Dont@know.why';", email);
        jse.executeScript("arguments[0].value='hopefully this is still ok';", company);
    }
}
