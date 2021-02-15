package com.automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryautomationbs {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rfs.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"semi-bold reg-btn block uprcse\"]")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"Full\")]//following::input[1]")).sendKeys("Naman") ;
        driver.findElement(By.xpath("//*[contains(text(),\"Email ID\")]//following::input[1]")).sendKeys("aid@gmail.com");
        driver.findElement(By.xpath("//*[contains(text(),\"Password\")]//following::input[1]")).sendKeys("Aasd@234");
        driver.findElement(By.xpath("//*[contains(text(),\"Mobile Number\")][1]//following::input[2]")).sendKeys("1109823401");
        driver.findElement(By.xpath("//*[contains(text(),\"Current Location\")][1]//following::div[4]")).click();
        Thread.sleep(300);
        driver.findElement(By.xpath("//*[contains(text(),\"Current Location\")][1]//following::input[1]")).sendKeys("Delhi");
        Thread.sleep(300);
        driver.findElement(By.xpath("//*[contains(text(),\"Current Location\")][1]//following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),\"Total \")]//following::div[7]")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"Total \")]//following::input[1]")).sendKeys("2");
        driver.findElement(By.xpath("//*[contains(text(),\"Total \")]//following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),\"Imm\")]")).click();
//        driver.findElement(By.xpath("//*[contains(text(),\"Key\")]//following::div[4]")).click();
//        driver.findElement(By.xpath("//*[contains(text(),\"Key\")]//following::input[1]")).sendKeys("C++");
//        driver.findElement(By.xpath("//*[contains(text(),\"Key\")]//following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred Industry\")]//following::div[7]")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred Industry\")]//following::input[1]")).sendKeys("IT");
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred Industry\")]//following::input[1]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred Industry\")]//following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred Fun\")]//following::div[5]")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred F\")]//following::input[1]")).sendKeys("IT");
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred F\")]//following::input[1]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred F\")]//following::input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),\"Preferred F\")]//following::input[1]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[contains(text(),\"Next\")]")).click();
      
        
//        driver.findElement(By.xpath("//*[contains(text(),\"Mobile Number\")][1]//following::input[2]")).sendKeys("1109823401");
//        driver.findElement(By.xpath("//*[contains(text(),\"Mobile Number\")][1]//following::input[2]")).sendKeys("1109823401");
	}
}
