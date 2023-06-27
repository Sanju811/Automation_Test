package com.Automation_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver driver;
	public void initialisebrowser()

	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Automationcourse\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	
	}
	public void browserCloseOrQuit()
	{
		//driver.close();
		driver.quit();
		
		
	}

	public static void main(String[] args) 
	{
		Base base = new Base();
		base.initialisebrowser();
		base.browserCloseOrQuit();

	}

}
