package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public void search() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click(); // if you have to accept cookies
        driver.findElement(By.tagName("input")).sendKeys("Software testing");
        driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
    }
}
