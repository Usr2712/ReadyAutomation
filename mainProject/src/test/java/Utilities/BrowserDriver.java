package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.util.Arrays;

import static Utilities.ReusableMethods.getProp;
import static Utilities.ReusableMethods.threadSleep;

public class BrowserDriver {


    static Props prop = new Props();
    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static ChromeOptions options;

    public BrowserDriver() {
        launchBrowserAndNavigateToUrl();
    }

    public static void launchBrowserAndNavigateToUrl() {
       // driver = new ChromeDriver(getChromeOptions());
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        threadSleep(6000);

          String url =getProp("url");// Fetching the URL

        if (url == null || url.isEmpty()) {
            throw new NullPointerException("URL is null! Check properties file.");
        }
        driver.get(url);
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            new BrowserDriver().launchBrowserAndNavigateToUrl();  // Create instance only if not already created
        }
        return driver;
    }

 /*   public static WebDriver getWebDriver(){
        return driver;
    }*/

  /*  public static ChromeOptions getChromeOptions() {
        options = new ChromeOptions();

        options.setPageLoadTimeout(Duration.of(10, ChronoUnit.SECONDS));
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.setAcceptInsecureCerts(true);
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
//        options.addArguments("--headlss");
        return options;
    }*/

    public static void close(){
        driver.quit();
    }
}
