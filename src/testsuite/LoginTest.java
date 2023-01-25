package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
        @Test
        public void userSholdLoginSuccessfullyWithValid() {
            WebElement usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
            usernamefield.sendKeys("tomsmith");
            WebElement Passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
            Passwordfield.sendKeys("SuperSecretPassword!");
            WebElement loginclick = driver.findElement(By.xpath("//button[@type='submit']"));
            loginclick.click();
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        WebElement usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
        usernamefield.sendKeys("tomsmith1");
        WebElement Passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
        Passwordfield.sendKeys("SuperSecretPassword!");
        WebElement loginclick = driver.findElement(By.xpath("//button[@type='submit']"));
        loginclick.click();
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        WebElement usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
        usernamefield.sendKeys("tomsmith");
        WebElement Passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
        Passwordfield.sendKeys("SuperSecretPassword");
        WebElement loginclick = driver.findElement(By.xpath("//button[@type='submit']"));
        loginclick.click();

    }
}