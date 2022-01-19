package org.test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H {
	
	public static void main(String[] args)  {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[1]"));
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
	}

}
