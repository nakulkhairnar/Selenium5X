package Selenium_Learning;

import org.openqa.selenium.edge.EdgeDriver;

public class Sel_008
{
    //Diff between Close and Quit
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();//close all the //session/window/and stop the browser, session = null, error - session id is null

        //driver.close();//close the current browser window not full browser
        //closed the window, Session ID =! null, Error - invalid session ID


    }
}
