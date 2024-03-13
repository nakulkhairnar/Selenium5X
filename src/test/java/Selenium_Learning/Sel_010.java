package Selenium_Learning;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sel_010
{

        //open the app.vwo.com
        //print the title and get the current URl
        //Verify the current URL is app.vwo.com

        @Test(groups = "QA")
        @Description("Verify the current URL, title of the VWO app")

                public void testVWOlogin()
        {
            WebDriver driver = new EdgeDriver();
            driver.get("https://app.vwo.com");
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
            System.out.println(driver.getCurrentUrl());
            driver.quit();
        }

    }

