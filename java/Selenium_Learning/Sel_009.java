package Selenium_Learning;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Sel_009
{
    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver driver = new EdgeDriver(); // this is not a dynamic dispatch
        driver.get("https://bing.com"); //no back, forword allowed in case of get
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
