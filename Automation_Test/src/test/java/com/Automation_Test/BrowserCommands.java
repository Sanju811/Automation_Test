package com.Automation_Test;

public class BrowserCommands extends Base
{
	public void browserCommands()
	{
		String title = driver.getTitle();
		String pagesource = driver.getPageSource();
		String url = driver.getCurrentUrl();
	}
	

	public static void main(String[] args) 
	{
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initialisebrowser();
		browsercommands.browserCommands();
		browsercommands.browserCloseOrQuit();

	}

}
