package JAVA_CLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TEST1 {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Software\\edgedriver_win64 (2)\\msedgedriver.exe\\");
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
		String title = driver.getTitle();
		System.out.println("Page Title");
		String Input = driver.getPageSource();
		System.out.println();
		try {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		//driver.wait(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	System.out.println("Login_sussefully");
	
		}
		catch(Exception e)
		
		{
			
		System.out.println("test failed");
		System.out.println("Reason; "+ e.getMessage());
		
		
		}
	driver.close();
	driver.quit();
		
		
		
	}}