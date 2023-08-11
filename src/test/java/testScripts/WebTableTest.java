package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableTest {
	public static void main(String[] args)  {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
	String Salary=driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();

System.out.println(Salary);

String RightOfElement=driver.findElement(RelativeLocator.with(By.tagName("td")))
.toRightof(By.xpath("//td[contains(text(),'B. Wagner')]")).getText();

System.out.println(RightOfElement);



	
	}

	private static By with(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}}
