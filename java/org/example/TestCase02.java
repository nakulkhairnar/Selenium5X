package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02
{
    @Test
    @Description("Verify title of the website")
    public void vwoLogin()
    {
        WebDriver driver = new EdgeDriver();
        //create session --> Box --> Connect with browser via HTTP methods
        //session ID --> 16 alpha digit
        //Driver --> ref - functions --> drivers.get() --> HTTPs command --> Open a URL ("")
        //driver.command()--> API (Get,Post, Patch)--> webdriver w3c document
        //Flow/arch of selenium 4
        //w3c: code(Java, ruby, perl, python etc, )-->
        // users w3c protocols (in built in browsers)--> in 3.x -->
        // Json wire(API) protocol was there which was not there
        // server(ChromeDrivers)--> Chrome Browser, Edge, Browser, IEBrowser
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());

    }
}
