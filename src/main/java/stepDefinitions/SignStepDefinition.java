package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignStepDefinition {
    WebDriver driver;

    @Given("^user is on My Store Home page$")
    public void userIsOnMyStoreHomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("^user clicks sign in link and enters username and password$")
    public void userEntersUsernameAndPassword() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("vivekraoba@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Butterfly25");
        Thread.sleep(1000);
    }

    @Then("^user clicks on Signin button$")
    public void userClicksOnSigninButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }


}
