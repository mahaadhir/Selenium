package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://select2.org/dropdown");
		driver.manage().window().maximize();
		
		WebElement Sel = driver.findElement(By.xpath("//select[@class = 'js-example-templating js-states form-control select2-hidden-accessible']"));
		
		Select s = new Select(Sel);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("CO");
		Thread.sleep(3000);
		s.selectByVisibleText("California");
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
	}

}
