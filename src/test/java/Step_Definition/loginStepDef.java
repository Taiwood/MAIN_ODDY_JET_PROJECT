package Step_Definition;


import Utility.login_page;
import Utility.Manage_Driver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by Taiwo on 15/07/2017.
 */


public class loginStepDef extends Manage_Driver{


WebDriver driver;
login_page login_steps = new login_page();
Manage_Driver selected_browser = new Manage_Driver();

@Before
public void start_session(){
    selected_browser.set_driver("firefox");
    selected_browser.browser_setting();
}

    @Given("^am on the \"([^\"]*)\" Page$")
    public void amOnThePage(String text) throws Throwable {

         switch(text){
             case"Landing":
                 login_steps.launch_browser();
                 login_steps.assert_text("Login");
             break;
             case"Home":
                 login_steps.assert_text("Home");
                 break;
                 default:
                     break;
         }


    }

    @And("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iEnterMyAs(String selector, String  data) throws Throwable {
    switch (selector){
        case"Username":
            login_steps.Username_textfield(data);
            break;
        case"Password":
            login_steps.Password_textfield(data);
            break;
        default:
            break;
    }

    }

    @When("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        login_steps.click_loginbutton();
    }


 public void close_browser(){
    selected_browser.close_browser();

 }



}
