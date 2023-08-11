package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		//driver.get("https://www.google.com/");
		WebElement webelement=driver.findElement(By.id("APjFqb"));
		webelement.sendKeys("Java Tutorial");
		Thread.sleep(5000);
		List<WebElement> Elements = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
System.out.println(Elements.size());
		for(int i=0; i<Elements.size(); i++) {
			System.out.println(Elements.get(i).getAttribute("role"));
			System.out.println(Elements.get(i).getText());
			if(Elements.get(i).getText().equalsIgnoreCase("Java Tutorial pdf")) {
				Elements.get(i).click();
				break;
			}
		}
		
		
	}

}
