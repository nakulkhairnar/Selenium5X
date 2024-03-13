package Selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sel_001
{
    public static void main(String[] args)
    {
        WebDriver driver = new EdgeDriver(); // Session is created
        driver.get("https://artoftesting.com/"); //run the command --> Get method w3c protocol
        //Edge browser (Server)-> Tell the edge browser
        //Open the fresh copy of the edge Browser and open the URL ->
        //Driver --> command (Post)Request --> shut down the browser

    }
}
