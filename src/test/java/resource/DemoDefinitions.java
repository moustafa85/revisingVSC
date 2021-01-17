package resource;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoDefinitions
{

    WebDriver driver;
    @Given("I have s")
    public void i_have_a_configured_CucumberLesson()
    {
        System.setProperty("webdriver.chrome.driver","E:\\Technical Resources\\JavaWorkspace\\Training\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();


    }

    @When("^I run it ss$")
    public void i_run_it_within_my_IDE()
    {
        WebDriverWait driverWait = new WebDriverWait(driver,4);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys("tauuser");

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("password");

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button']")));
        driver.findElement(By.xpath("//input[@class='button']")).click();
    }

    @Then("^I will be astep definitions$")
    public void i_will_be_able_to_run_connected_step_definitions() throws InterruptedException {
        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(3000);
        driver.quit();

    }

}
