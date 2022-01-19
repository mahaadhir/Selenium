package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table"));
		List<WebElement> iRow = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < iRow.size(); i++) {
			
			WebElement row = iRow.get(i);
			List<WebElement> iData = row.findElements(By.tagName("td"));
			for (int j = 0; j < iData.size(); j++) {
				WebElement data = iData.get(j);
				String text = data.getText();
				System.out.println(text);
				
				
				
			}
			
		}
	}

}
