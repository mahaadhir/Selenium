package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type = 'text']"));
		search.sendKeys("Apple iPhone");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[3]")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		List<String> child1 = new ArrayList<String>(child);
		
		driver.switchTo().window(child1.get(2));
		WebElement element = driver.findElement(By.xpath("//span[@id = 'productTitle']"));
		String text = element.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
	}

}
