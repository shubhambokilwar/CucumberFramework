package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;

    @Given ("I am on the login page" )
    public void loginPage() {
        System.out.println("I am on the login page" );

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

    }

    @When("I enter correct usernae and password")
    public void iEnterCorrectUsernaeAndPassword() {
        System.out.println("I enter correct usernae and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
        
    }
    @Then("I should land on login page")
    public void iShouldLandOnLoginPage() {
        System.out.println("I should land on login page");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        Assert.assertEquals("This is not a dashboard" ,expected,actual);


    }

    @When("I enter incorrect usernae and inpassword")
    public void iEnterIncorrectUsernaeAndInpassword() {

        driver.findElement(By.id("login-username")).sendKeys("aaadmin");
        driver.findElement(By.id("login-password")).sendKeys("aaadmin");

    }

    @When("I enter blanck usernae and password")
    public void iEnterBlanckUsernaeAndPassword() {

        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");
    }

    @Then("I should not land on login page")
    public void iShouldNotLandOnLoginPage() {


        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        Assert.assertEquals("This is not a dashboard" ,expected,actual);

        System.out.println("shubham");



    }
}
