package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

    WebDriver driver;

    @Given("User opens google website")
    public void user_opens_google_website() {

    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Google Opened");

        driver.quit();
    }
}