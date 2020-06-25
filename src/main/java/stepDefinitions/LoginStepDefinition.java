package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Tr;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver;

    @Given("^user is already on Home Page$")
    public void userIsAlreadyOnHomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("^title of ContactUs page is My Store$")
    public void titleOfContactUsPageIsMyStore() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("My Store", title);
        Thread.sleep(1000);
    }

    @Then("^user clicks on ContactUs link and ContactUs Page displays$")
    public void userClicksOnContactUsLinkAndDetailsDisplay() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
        Thread.sleep(1000);
    }

    @Then("^user clicks on Subject Handling drop down button and selects Customer service$")
    public void userClicksOnSubjectHandlingDropDownButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"id_contact\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"id_contact\"]")).sendKeys("Customer service");
        Thread.sleep(1000);
    }

    @Then("^user enters Email address and Order Number$")
    public void userEntersEmailAddressAndOrderNumber() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vivek@test.com");
        driver.findElement(By.xpath("//*[@id=\"id_order\"]")).sendKeys("Viv12345");
        Thread.sleep(1000);
    }


    @Then("^user navigates to message section and enters Message and click send button$")
    public void userNavigatesToMessageSectionAndEntersMessage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("I am Successful in Java Selenium");
        driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
        Thread.sleep(1000);
    }

    @Then("^user clicks on Attach file and selects a file to upload$")
    public void userClicksOnAttachFileAndSelectsAFileToUpload() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("C:\\Users\\avkin\\OneDrive\\Desktop");
        //driver.findElement(By.name("fileUpload")).click();
        Thread.sleep(1000);
    }



}

