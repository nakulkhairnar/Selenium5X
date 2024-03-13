package Selenium_Learning;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Sel_006
{
    public static void main(String[] args)
    {

        EdgeOptions edgeOptions = new EdgeOptions();
        //page load options
        //normal: It will take time untill load all the parameters
        //eager: it will capture the title and will closed
        //none: it will not wait to load all param
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver = new EdgeDriver(edgeOptions);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("121.40.185.42:1080");

        edgeOptions.setCapability("proxy", proxy);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
