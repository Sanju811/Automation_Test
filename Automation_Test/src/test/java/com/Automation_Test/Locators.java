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
	public void locateByDynamicXpath()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//div[contains(@id,'-one')]")); //contains
		driver.findElement(By.xpath("//button[contains(@id,'-two')]"));
		driver.findElement(By.xpath("//a[contains(@id,'alert')]"));
		driver.findElement(By.xpath("//a[contains(@id,'list')]"));
		driver.findElement(By.xpath("//a[contains(@id,'-bars')]"));

		driver.findElement(By.xpath("//button[text()='Show Message']")); //text()
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//a[text()='Home']"));
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Sell']"));
		driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
		driver.findElement(By.xpath("//span[text()='All']"));



		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[starts-with(text(),'Show Message')]")); //starts with
		driver.findElement(By.xpath("//button[starts-with(text(),'Get Total')]"));
		driver.findElement(By.xpath("//a[starts-with(text(),'Home')]"));
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[starts-with(text(),'Sell')]"));
		driver.findElement(By.xpath("//a[starts-with(@class,'nav-a  ')]"));
		driver.findElement(By.xpath("//input[starts-with(@value,'Go')]"));


		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[starts-with(@id,'button') and text()='Show Message']")); //using and
		driver.findElement(By.xpath("//button[contains(@id,'-one') and @type='button']"));
		
		driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']")); //using or
		driver.findElement(By.xpath("//button[@class='navbar-toggler' or @type='button' ]"));
	}
	public void xpathAxesMethod()
	{
		driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']")); //child
		driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@class='nav-left']//child::div[@id='nav-logo']"));
		driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Gift Cards']"));
		driver.findElement(By.xpath("//div[@class='nav-right']//child::div[@id='nav-tools']"));


		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@id='button-one']//parent::form")); //parent
		driver.findElement(By.xpath("//button[contains(@type,'button')]//parent::form"));
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@value='Go']//parent::span"));
		driver.findElement(By.xpath("//span[@id='nav-search-label-id']//parent::div"));
		driver.findElement(By.xpath("//script[@type='a-state']//parent::div"));


		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")); //following
		driver.findElement(By.xpath("//div[@class='mb-sec']//following::section"));
		driver.findElement(By.xpath("//div[@class='card']//following::ul"));
		driver.findElement(By.xpath("//div[@class='form-group']//following::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//section[@class='clearfix']//following::footer"));

		
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));//preceding
		driver.findElement(By.xpath("//section[@class='clearfix']//preceding::div[@class='mb-sec']"));
		driver.findElement(By.xpath("//div[@class='form-group']//preceding::form"));
		driver.findElement(By.xpath("//div[@class='mb-sec']//preceding::div[@class='header-top']"));
		driver.findElement(By.xpath("//div[@class='card']//preceding::ul[@class='navbar-nav']"));
		
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']")); //ancestor
		driver.findElement(By.xpath("//div[@class='card']//ancestor::div[@class='container page']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//ancestor::ul"));
		driver.findElement(By.xpath("//section[@class='clearfix']//ancestor::div[@class='row']"));

		driver.findElement(By.xpath("//form[@method='POST']//descendant::div[@id='message-one']")); //descendant
		driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
		driver.findElement(By.xpath("//div[@class='form-group']//descendant::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::ul"));
		driver.findElement(By.xpath("//div[@class='mb-sec']//descendant::div[@class='container']"));
		
		driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input")); //following-sibling
		driver.findElement(By.xpath("//button[@type='button']//following-sibling::div[@id='message-one']"));
		driver.findElement(By.xpath("//label[text()='Enter value A']//following-sibling::input"));
		driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div"));
		driver.findElement(By.xpath("//label[text()='Enter value B']//following-sibling::input"));
		
		driver.findElement(By.xpath("(//form[@method='POST'])[1]")); //indexes
	}
	
	public static void main(String[] args) 
	{
		Locators locators = new Locators();
		locators.initialisebrowser();
		//locators.locateById();
		//locators.locateByClassname();
		//locators.locateByLinktext();
		//locators.locateByPartialLinktext();
		//locators.locateByCssSelector();
		//locators.locateByName();
		//locators.locateByXpath();
		locators.locateByDynamicXpath();
		locators.xpathAxesMethod();
		locators.browserCloseOrQuit();
	}

}
