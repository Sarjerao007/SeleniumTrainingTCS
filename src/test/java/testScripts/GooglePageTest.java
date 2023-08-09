package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		//driver.get("https://www.google.com/");
		WebElement webelement=driver.findElement(By.id("APjFqb"));
		webelement.sendKeys("Java Tutorial");
		webelement.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("The Page Title is  "+title);
		System.out.println("The Page Title is  "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("The Page Title is  "+driver.getCurrentUrl());
		System.out.println("The Page Title is  "+driver.getTitle());
		
		//driver.navigate().forward();

		//driver.close();

	}

}
