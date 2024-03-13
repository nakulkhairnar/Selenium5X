package Selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Sel_003
{
    @Test
    public void testmethod()
    {
        //Extensions to the Edge Browser
        //Youtube Video - add blocker extension
        //by selenium or not?
        EdgeOptions edgeOptions = new EdgeOptions();
       // edgeOptions.addArguments("--headless");
        edgeOptions.addExtensions(new File("/Users/Nakul.Khairnar/Downloads/AdBlock-—-best-ad-blocker.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
