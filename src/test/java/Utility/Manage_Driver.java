package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Taiwo on 15/07/2017.
 */
public class Manage_Driver {

    public static WebDriver driver;

    public void set_driver(String browser){

        if(driver == null){
            if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","C:\\browsers\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if(browser.equalsIgnoreCase("ie")){
                System.setProperty("webdriver.ie.driver", "C:\\browsers\\IEDriverserver.exe");
                driver = new InternetExplorerDriver();
            }

        }

    }
    public void browser_setting(){
        driver.manage().window().maximize();
    }

    public void close_browser(){
        driver.quit();
        driver = null;
    }

}
