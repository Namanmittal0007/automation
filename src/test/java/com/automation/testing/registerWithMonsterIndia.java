package com.automation.testing;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerWithMonsterIndia {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class=\"semi-bold reg-btn block uprcse\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Enter your full name\"]")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@class=\"input email-autocomplete-input\"]")).sendKeys("qqaaaaaaaa@gmail.com");
        driver.findElement(By.xpath("//input[@class=\"input pass\"]")).sendKeys("abc@12345");
        driver.findElement(By.xpath("//input[@name=\"Mobile Number\"]")).sendKeys("1011001169");
        driver.findElement(By.xpath("//*[text()=\"Current Location \"]//following::div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder=\"Search Location\"]")).sendKeys("delhi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder=\"Search Location\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"multiselect__tags modal-ref-class\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Experience in years\"]")).sendKeys("2");
        driver.findElement(By.xpath("//input[@placeholder=\"Experience in years\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class=\"multiselect modal-ref-class\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Experience in months\"]")).sendKeys("1");
        driver.findElement(By.xpath("//input[@placeholder=\"Experience in months\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@class=\"labl-txt color-black\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"multiselect__placeholder modal-ref-class single-selected textWrapper\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys("SDE");
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys("C++");
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter or select your skills\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//span[@class=\"multiselect__placeholder modal-ref-class textWrapper\"])[1]")).click();
        driver.findElement(By.xpath("//input[@name=\"industry\" and @placeholder=\"Maximum 2 industries can be selected\"]")).sendKeys("computer");
        driver.findElement(By.xpath("//input[@name=\"industry\" and @placeholder=\"Maximum 2 industries can be selected\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@name=\"industry\" and @placeholder=\"Maximum 2 industries can be selected\"]")).sendKeys("computer");
        driver.findElement(By.xpath("//input[@name=\"industry\" and @placeholder=\"Maximum 2 industries can be selected\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@class=\"multiselect__placeholder modal-ref-class textWrapper\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"function\" and @placeholder=\"Maximum 2 functions can be selected\"]")).sendKeys("software");
        driver.findElement(By.xpath("//input[@name=\"function\" and @placeholder=\"Maximum 2 functions can be selected\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@name=\"function\" and @placeholder=\"Maximum 2 functions can be selected\"]")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@name=\"function\" and @placeholder=\"Maximum 2 functions can be selected\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@name=\"function\" and @placeholder=\"Maximum 2 functions can be selected\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//button[@id=\"registerSubmit\" and @class=\"btn btn-green mt10\"]")).click();
        Thread.sleep(5000);
	}

}
