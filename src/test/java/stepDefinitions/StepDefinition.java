package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;
    @Given("User opens browser")
    public void user_opens_browser() {
        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

    }
    @When("The user goes to URL {string}")
    public void the_user_goes_to_url(String string) {
        driver.get("https://www.gofundme.com/");

    }
    @When("The user click in the Sign In button")
    public void the_user_click_in_the_sign_in_button() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/nav/div[3]/a[2]")).click();

    }
    @When("The user enters correct Email Address")
    public void the_user_enters_correct_email_address() {
        driver.findElement(By.id("email")).sendKeys("Raj123@gmail.com");

    }
    @When("The user enters correct password")
    public void the_user_enters_correct_password() {
        driver.findElement(By.id("password")).sendKeys("Raj48145568");

    }
    @When("The user click on the Sign in to GoFundMe button")
    public void the_user_click_on_the_sign_in_to_go_fund_me_button() {
        driver.findElement(By.xpath("//*[@id=\"react-render\"]/div/div[2]/div[1]/div/div/div[2]/form/button")).click();

    }
    @Then( "The user successfully log in the GoFundME account")
    public void the_user_successfully_log_in_the_go_fund_me_account() {
        driver.close();
        System.out.println("The Test has been completed ");

    }
}
