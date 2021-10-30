package com.learn.HariLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari\\Downloads\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
		
			
			driver.get("https://www.google.co.in");
		
		
	}
	

}
