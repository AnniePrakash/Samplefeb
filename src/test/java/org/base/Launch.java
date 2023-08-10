package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
		public static void main(String[] args) throws InterruptedException {
		
		//To configure the browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//To maximize the windows
		
		driver.manage().window().maximize();
		
		//To launch the Browser
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		Actions actions=new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		
		
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		
		Thread.sleep(3000);
		
		
		actions.dragAndDrop(source, target).perform();
		
		
		
	}

}
