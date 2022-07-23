package com.flipkart1.stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.flipkart1.objectrepository.MobliePuschasePage;
import com.flipkart1.resources.Commonactions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class MobliePurchaseSteps extends Commonactions {
	Commonactions c=new Commonactions();
	MobliePuschasePage m=new MobliePuschasePage();
		@Given("User Launches the EBay Website.")
	public void user_Launches_the_EBay_Website() {
	c.BrowserLauncher();
	}

	@When("user Will Search the Redmi mobile.")
	public void user_Will_Search_the_Redmi_mobile() throws Throwable {
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("redmi mobiles",Keys.ENTER);
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@role='button']")).click();
	
	
	}

	@When("user will select the mobile.")
	public void user_will_select_the_mobile() throws Throwable {
		driver.findElement(By.xpath("(//h3[@class='s-item__title'])[2]")).click();
	 Thread.sleep(2000);
	 c.windowSwitch();
	}

	@When("user will add into the cart.")
	public void user_will_add_into_the_cart() {
	driver.findElement(By.id("isCartBtn_btn")).click();
	   
	}

	@When("user will select the storage size.")
	public void user_will_select_the_storage_size() throws Throwable {
		c.Select();
	  
	}

	@When("user will select the colour")
	public void user_will_select_the_colour() throws Throwable {
		 c.Select();
	}

	@When("user will click the BuyNow option")
	public void user_will_click_the_BuyNow_option() {
		driver.findElement(By.id("binBtn_btn")).click();
	  
	}

	@When("the user will login.")
	public void the_user_will_login() {
	
	  driver.findElement(By.xpath("//button[@class='clzBtn']")).click();
		
			
		
		
	}

	@Then("user will make the payments.")
	public void user_will_make_the_payments() {
		System.out.println("payment sucessful");
	  
	}

	@Then("user will recive the conformation message.")
	public void user_will_recive_the_conformation_message() {
	  System.out.println("phone booked");
	}
	@When("user Will Search by one dim map.")
	public void user_Will_Search_by_one_dim_map(DataTable dataTable) throws Throwable {
		Map<String,String> asMap = dataTable.asMap(String.class,String.class);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(asMap.get("phone1"),Keys.ENTER);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='button']")).click();
	}

}
