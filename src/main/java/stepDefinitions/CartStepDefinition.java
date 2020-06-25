package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartStepDefinition {
    WebDriver driver;

    @Given("^when user is on Home page with cart section$")
    public void whenUserIsOnHomePageWithCartSection() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }


    @When("^user searches for a product and click search button$")
    public void userSearchesForAProductAndClickSearchButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("shirt");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }


    @Then("^user select a product, moves mouse over and clicks on Add to Cart button$")
    public void userSelectAProductMovesMouseOverAndClicksOnAddToCartButton() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]")).isDisplayed();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Then("^user click on Proceed to checkout button$")
    public void userClickOnFinalProceedToCheckoutButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
}
