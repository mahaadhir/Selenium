package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		List<WebElement> Frame = driver.findElements(By.tagName("iframe"));
		System.out.println(Frame.size());
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src = 'Jmeter720.png']")).click();
		driver.switchTo().defaultContent();
		
		
		
		
		
		
				
			}

}
