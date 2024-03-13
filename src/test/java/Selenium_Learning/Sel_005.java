package Selenium_Learning;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Sel_005
{
    public static void main(String[] args)
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        //1 headless
        //2 start max
        //3 window size
        //4 add extentions and 100 of other options - we can use with it

        //edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--window-size==800,600");
        edgeOptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeOptions); //dynamic dispatch --> runtime poly
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        //onothor way is
        //driver.manage().window().maximize();
        driver.quit();

    }
}
