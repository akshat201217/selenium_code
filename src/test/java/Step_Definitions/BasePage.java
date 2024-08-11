package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;

    @Given("User navigates to the login page.")
    public void user_navigates_to_the_login_page() {
        // Setup WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Configure ChromeOptions if needed
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Example argument to maximize the window

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);

        // Set implicit wait and page load timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        // Open the login page URL (replace with actual URL)
        driver.get("https://www.google.co.in/");

        System.out.println("Inside browser open step");
    }

    @When("user successfully enters the log in details.")
    public void user_successfully_enters_the_log_in_details() {
        // Implement login details entry
      //  throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to view the product category page.")
    public void user_should_be_able_to_view_the_product_category_page() {
        // Implement validation of the product category page
     //   throw new io.cucumber.java.PendingException();
    }
}
