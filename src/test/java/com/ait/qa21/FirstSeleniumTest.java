package com.ait.qa21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    //before - setUp
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
    }
    //test

    @Test
    public void openSite(){
        System.out.println("Site opened!!!");
    }
    //after - tearDown
}
