package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\eclipse-workspace\\Bhuvana\\Aleart1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement btnClick = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		btnClick.click();
		Alert a1 =driver.switchTo().alert();
		a1.accept();
		//driver.quit();
	}
}
