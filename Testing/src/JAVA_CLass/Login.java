package JAVA_CLass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
public void test() throws IOException, InterruptedException
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
        System.out.println("Added");
        System.out.println("new added");
		System.out.println("code push kro");
		System.out.println("jay ho");

    } catch (Exception e) {

        System.out.println("Test Failed");
        System.out.println(e.getMessage());
    }
	Thread.sleep(3000);
	try {
	File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\manis\\git\\repository\\Testing\\screenshot\\screenshot.png");
	Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	System.out.println("Screenshot succesfully");
	}catch (Exception e) 
	{
	}
}
@AfterMethod
public void teardown()

{
	
	driver.quit();
	System.out.println("browser closed");
	}
}


