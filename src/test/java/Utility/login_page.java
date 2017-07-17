package Utility;

import Utility.Manage_Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static sun.security.pkcs.ContentInfo.data;

/**
 * Created by Taiwo on 15/07/2017.
 */
public class login_page extends Manage_Driver {


    By Username = By.id("usernamelogin");
    By Password = By.id("loginPassword");
    By Login_Button = By.id("LoginBtn");


    public void launch_browser(){
        driver.get("http://automatetillinfinity.co.uk/");


    }
    public void Username_textfield(String text){
          driver.findElement(Username).sendKeys(text);
    }

    public void Password_textfield(String text){
        driver.findElement(Password).sendKeys(text);
    }

    public void click_loginbutton(){
        driver.findElement(Login_Button).click();
    }

    public void assert_text(String text){

        String Actual_title = driver.getTitle();
        String Expected_title = text;
        Assert.assertEquals(Actual_title, Expected_title);
    }


}
