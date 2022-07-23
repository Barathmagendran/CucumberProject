package com.flipkart1.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart1.resources.Commonactions;

public class MobliePuschasePage extends Commonactions  {
	public MobliePuschasePage() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//button[@class='clzBtn']")
private WebElement close;
public WebElement getClose() {
	return close;
}

}
