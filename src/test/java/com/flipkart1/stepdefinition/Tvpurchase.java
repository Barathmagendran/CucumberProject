package com.flipkart1.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.flipkart1.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tvpurchase extends Commonactions  {
	Commonactions c=new Commonactions ();
	@Given("user will launch the Ebay WebSite.")
	public void user_will_launch_the_Ebay_WebSite() {
	  c.BrowserLauncher();
	}

	@When("user will search poco Mobiles in Ebay website.")
	public void user_will_search_poco_Mobiles_in_Ebay_website() {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("poco mobiles",Keys.ENTER);
	}

	@When("user will select the tv.")
	public void user_will_select_the_tv() throws Throwable {
	  driver.findElement(By.xpath("(//h3[@class='s-item__title'])[3]")).click();
	  Thread.sleep(2000);
	  c.windowSwitch();
	}

	@When("user will select add to cart.")
	public void user_will_select_add_to_cart() {
		driver.findElement(By.id("isCartBtn_btn")).click();
	}

	@When("user will select the material.")
	public void user_will_select_the_material() throws Throwable {
		  WebElement mat = driver.findElement(By.xpath("//select[@name='Materiaal']"));
		  Select s2=new Select(mat);
		  s2.selectByVisibleText("For Xiaomi 8");
	}

	@When("user will select the color.")
	public void user_will_select_the_color() throws Throwable {
		 
		  WebElement sel3 = driver.findElement(By.xpath("//select[@name='Kleur']"));
		  Select s3=new Select(sel3);
		 s3.selectByVisibleText("Red");
	}

	@Then("user will login.")
	public void user_will_login() {
		driver.findElement(By.id("isCartBtn_btn")).click();
	}

	@Then("user make Payments.")
	public void user_make_Payments() {
		System.out.println("payment sucessful");
	}
}

