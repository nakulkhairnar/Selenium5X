package Selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Sel_002
{
    @Test
    public void testmethod()
    {
        //interface ref = new class();
        //inheritance
        //upcasting --> dynamic dispatch
        WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new FirefoxDriver();
        WebDriver driver4 = new InternetExplorerDriver();
        //Search context(I)--> web driver(I)--> remote web driver(C) --> chromium driver(C) --> edge driver(C)
        //number of utility will increase from parent to son

        //search context - interface - find element and find elements --> great grand father
        //WebDriver - interface - some incomplete functions -> Grand father
        //RemoteWebDriver - Class - It also has some function - Father
        //ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver Class -son

        //Selenium - architecture is based on API
        //Create session, commands or function --> API request to browser Driver ()
        //Paass the commands as API

        //Dynamic dispatch - any GGF, GF, F can ref to child object

        //EdgeDriver driver = new EdgeDriver(); case 1
        //WebDriver driver1 = new EdgeDriver(); case 2
        driver1 = new ChromeDriver();
        //why we use case 2 insted of the case one
        //if we used the case one then we weill not be able to reuse the driver instance or ref
        //so it means you can't change the browser in the script
        //scenarios 1
        //do we want to run on chrome or edge ?
        //ChromeDriver driver = new ChromeDriver();
        //scenarios 2
        //Do you want to run chrome then change to edge then ?
        //Ans: driver = new EdgeDriver();
        //scenarios 3
        //Do you want to run on the multiple browser ?
        //RemoteWebDriver driver(with grid) - Advance (Last 2 session)




    }
}
