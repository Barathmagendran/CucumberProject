package com.flipkart1.resources;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver;

	public  void BrowserLauncher() {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https:/www.ebay.com/");
    driver.manage().window().maximize();
    System.out.println("Browser launched SucessFully");
	}
public void windowSwitch() {
	Set<String> child = driver.getWindowHandles();
       for(String x:child) {
    	   driver.switchTo().window(x);
       }
}
public void Select() throws Throwable {
	WebElement sel = driver.findElement(By.xpath("//select[@name='storage capacities-']"));
	  Select s=new Select(sel);
	  s.selectByVisibleText("64GB");
	  Thread.sleep(2000);
	  WebElement sel1 = driver.findElement(By.xpath("//select[@name='Color']"));
	  Select s1=new Select(sel1);
	  s1.selectByVisibleText("Blue");
	  Thread.sleep(2000);
	
	 
	  
}
}
