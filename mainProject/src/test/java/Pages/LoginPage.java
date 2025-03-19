package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utilities.GlobalVariables.Context.Vegetablename;
import static Utilities.GlobalVariables.ScenarioContext.setContext;
import static Utilities.ReusableMethods.*;

public class LoginPage {

    WebDriver driver;


    //without pagefactory
   // public static By searchbar = By.xpath("//input[@type='search']");

    //with pagefactory
    @FindBy(xpath = "//input[@type='search']")
    static WebElement searchbar;

    public LoginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  void enterEmail(String vegetablename) {

        //without pagefactory
       // getWebDriver().findElement(searchbar).click();
        //getWebDriver().findElement(searchbar).sendKeys(getProp(vegetablename));

        //with pagefactory
        searchbar.click();
        searchbar.sendKeys(getProp(vegetablename));
        setContext(Vegetablename, vegetablename);


// To get string form context
// String email = (String) getContext(USERNAME);
    }
}