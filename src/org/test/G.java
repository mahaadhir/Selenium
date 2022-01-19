package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String launch = "https://www.amazon.in/ref=nav_logo";
		driver.get(launch);
		driver.manage().window().maximize();
		WebElement Departure = driver.findElement(By.id("twotabsearchtextbox"));
		Departure.sendKeys("Apple Iphone 13");
		//WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		//search.click();
		
		WebElement forgot = driver.findElement(By.xpath("//h2[contains(text(),'Pay your credit card bills on Amazon')]"));
		String text = forgot.getText();
		System.out.println(text);
	
		
		
		
		
		
	
	}

}
