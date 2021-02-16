package com.automation.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class serachresultrelevancy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa1.monsterindia.com/turkey/api/v1/jobs/suggested?query=Architect&expectedSalary=800000&sort=1&limit=40&siteContext=rexmonster&locations=Bengaluru%20/%20Bangalore&roles=java%20developer&industries=Procurement/Construction");
		driver.manage().window().maximize();
	}
}
