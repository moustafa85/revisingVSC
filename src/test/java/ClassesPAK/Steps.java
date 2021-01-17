package ClassesPAK;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Steps
{

    WebDriver driver;

    @Before
    public void Setup()
    {
        System.setProperty("webdriver.chrome.driver","E:\\Technical Resources\\JavaWorkspace\\Training\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I have configured CucumberLesson")
    public void i_have_a_configured_CucumberLesson()
    {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }

    @When("^I run it within my IDE \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_run_it_within_my_IDE( String Username, String Password)
    {
        WebDriverWait driverWait = new WebDriverWait(driver,4);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys(Username);

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys(Password);

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button']")));
        driver.findElement(By.xpath("//input[@class='button']")).click();
    }

    @Then("^I will be able to run connected step definitions$")
    public void i_will_be_able_to_run_connected_step_definitions()
    {
        driver.findElement(By.linkText("Log Out")).click();
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
