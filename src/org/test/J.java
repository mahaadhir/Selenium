package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class J {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class ='btn btn-danger']")).click();;
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		a.dismiss();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		String text = a.getText();
		System.out.println(text);
		
		a.sendKeys("Selenium");
		a.accept();
		
		WebElement texted = driver.findElement(By.id("demo1"));
		String text2 = texted.getText();
		System.out.println(text2);
		
		if (text2.contains("Selenium")) {
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			File source = tk.getScreenshotAs(OutputType.FILE);
			File desc = new File("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\Alert");
			FileUtils.copyFile(source, desc);
		
		}
			else {
				System.out.println("Not Present");
			}
			
		
		
		
	}

}
