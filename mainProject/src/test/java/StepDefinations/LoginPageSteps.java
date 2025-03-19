package StepDefinations;

import Pages.LoginPage;
import Utilities.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;



public class LoginPageSteps {

    LoginPage loginPage=new LoginPage(BrowserDriver.getWebDriver());

    @Given("^user logged into website and search for with '(.*)'$")
    public void login(String vegetable) {

        loginPage.enterEmail(vegetable);
    }


}
