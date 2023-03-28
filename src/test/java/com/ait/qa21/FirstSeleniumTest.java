package com.ait.qa21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    //before - setUp
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
       // driver = new FirefoxDriver();
      //  driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");// open with history
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    //test

    @Test
    public void openSite(){
        System.out.println("Site opened!!!");
    }
    //after - tearDown
    @AfterMethod(enabled = false)//close false
    public void tearDown(){
        driver.quit();
        //driver.close(); //only one tab(if tab only one ->close browser)
    }
}
