package com.Automation_Test;

import org.openqa.selenium.By;

public class Locators extends Base
{
	public void locateById()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.id("message-two"));
		driver.findElement(By.id("collapsibleNavbar"));
		driver.findElement(By.id("progress-bars"));
		driver.findElement(By.id("alert-modal"));
		driver.findElement(By.id("list0box"));
	}
	public void locateByClassname()
	{
		driver.findElement(By.className("navbar-nav"));
		driver.findElement(By.className("header-top"));
		driver.findElement(By.className("mb-sec"));
		driver.findElement(By.className("clearfix"));
		driver.findElement(By.className("copyright"));
		driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.findElement(By.className("btn-block"));
	}
	public void locateByLinktext() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.linkText("Form Submit"));
		driver.findElement(By.linkText("Ajax Form Submit"));
		
	} 
	public void locateByPartialLinktext() 
	{
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.partialLinkText("Checkbox"));
		driver.findElement(By.partialLinkText("Select"));
		driver.findElement(By.partialLinkText("Form"));
		driver.findElement(By.partialLinkText("Ajax Form"));
	}
	public void locateByCssSelector()
	{
		driver.findElement(By.cssSelector("button#button-one"));
		driver.findElement(By.cssSelector("ul.navbar-nav"));
		driver.findElement(By.cssSelector("button[id=button-one]"));
		driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		driver.findElement(By.cssSelector("a#list0box"));
		driver.findElement(By.cssSelector("button.navbar-toggler"));
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.cssSelector("div.nav-search-field"));
		driver.findElement(By.cssSelector("a[id=\"skippedLink\"]"));
	}
	public void locateByName()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
		driver.findElement(By.name("daterange"));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.name("q"));
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("field-keywords"));
	}
	public void locateByXpath()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
		driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		driver.findElement(By.xpath("//div[@class='top-logo']"));
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[@id='nav-flyout-iss-anchor']"));
		driver.findElement(By.xpath("//div[@id='nav-flyout-searchAjax']"));
	}
	
	public static void main(String[] args) 
	{
		Locators locators = new Locators();
		locators.initialisebrowser();
		locators.locateById();
		locators.locateByClassname();
		locators.locateByLinktext();
		locators.locateByPartialLinktext();
		locators.locateByCssSelector();
		locators.locateByName();
		locators.locateByXpath();
		locators.browserCloseOrQuit();
	}

}
