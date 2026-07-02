package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class automation {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver" , "C:\\Users\\manis\\OneDrive\\Desktop\\software\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver driver = new  EdgeDriver();
		
		driver.get("https://www.saucedemo.com");
		driver.wait(3000);
		
		driver.findElement(By.xpath("//input[@class=\"input_error form_input\"][1]")).sendKeys("standard_user");
		
		
	
		
		
		
	}
}
