package JAVA_CLass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login
{
	
WebDriver driver;
@BeforeMethod
public void setup()

{
	driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com	");
	System.out.println("browerlaunch");
	}

@Test
public void test()
{
	try {

        driver.findElement(By.xpath("//input[@placeholder='Username']"))
              .sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@placeholder='Password']"))
              .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@value='Login']"))
              .click();
        Thread.sleep(4000);

        System.out.println("Login Successful");
        System.out.println("login ok git hub");
        System.out.println("feture branch change ho gya hai");

    } catch (Exception e) {

        System.out.println("Test Failed");
        System.out.println(e.getMessage());
    }

}
@AfterMethod
public void teardown()

{
	
	driver.quit();
	System.out.println("browser closed");
	}
}


