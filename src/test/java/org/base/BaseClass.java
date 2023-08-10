package org.base;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
    public static void browserLaunch(String browser) {
    	
    	if(browser.equals("chrome")) {
    		
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("firefox")) {
    		
    		WebDriverManager.firefoxdriver().setup();
    		
    		driver=new FirefoxDriver();
    		
    		    	}
    	
    	else if(browser.equalsIgnoreCase("edge")) {
    		
    		WebDriverManager.edgedriver().setup();
    		
    		driver=new EdgeDriver();
    		
    	}
    	
    	else {
    		System.out.println("Enter correct browser");
    	}
    }
    
    public static void loadUrl(String url) {
    	
    	driver.get(url);
    }
    
    
   public static void maximize() {
	   driver.manage().window().maximize();

	}
    
   
   public static void minimize() {
	   
	   driver.manage().window().minimize();
   }
   
   public static void setsize(int width,int height) {
	   
	 Dimension dimension=new Dimension(width, height);
	   
	   driver.manage().window().setSize(dimension);
   }
   
   public static void setposition(int x,int y) {
	   
	   Point point=new Point(x,y);
	   
	   driver.manage().window().setPosition(point);
	   	   
   }
   
   public static WebElement findElement(String locator,String value)  {
	   
	   WebElement element=null;
	   
	   if(locator.equalsIgnoreCase("id")) {
		   element=driver.findElement(By.id(value));
	   }
	   else if(locator.equalsIgnoreCase("name")) {
		   element=driver.findElement(By.name(value));
	   }
	   else if(locator.equalsIgnoreCase("classname")) {
		   element=driver.findElement(By.className(value));
	   }
	   else if(locator.equalsIgnoreCase("tagname")) {
		   element=driver.findElement(By.tagName(value));
	   }
	   
	   else if(locator.equalsIgnoreCase("linktext")) {
		   element=driver.findElement(By.linkText(value));
	   }
	   else if(locator.equalsIgnoreCase("partiallinktext")) {
		   element=driver.findElement(By.partialLinkText(value));
	   }
	   else if(locator.equalsIgnoreCase("xpath")) {
		   element=driver.findElement(By.xpath(value));
	   }
	   else if(locator.equalsIgnoreCase("cssselector")) {
		   element=driver.findElement(By.cssSelector(value));
	   }
	   
	   else {
		   System.out.println("Enter correct Locator");
		 
	   }
	   
	   return element;
   }
   
   public static void quit() {
	   
	   driver.quit();
   }
   
   public static void close() {
	   driver.close();
   }
   
   public static String windowHandle() {
	   String windowHandle = driver.getWindowHandle();
	   
	   return windowHandle;
   }
   
   public static Set<String> windowHandles() {
	   
	   Set<String> windowHandles = driver.getWindowHandles();
	   
	   return windowHandles;
	   
	   
   }
   
   public static void navigateTo(String url) {
	   driver.navigate().to(url);
   }
   
   public static void navigateBack() {
	   driver.navigate().back();
   }
   
   public static void navigateTo() {
	   driver.navigate().forward();
	   
	      }
   
   public static void refresh() {
	   driver.navigate().refresh();
   }
   
   public static void switchToAlert() {
	   
	   driver.switchTo().alert();
   }
   
public static void switchToDefault() {
	   
	   driver.switchTo().defaultContent();
   }
   
      
   public static void switchtoWindow(String nameOrHandle) {
	   
	   driver.switchTo().window(nameOrHandle);
	   
	       
   }
   
   public static void screenShot(File file) throws IOException {
	   TakesScreenshot screenshot=(TakesScreenshot) driver;
	   
	   File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	   
	   FileUtils.copyFile(screenshotAs, file);
   }
   
   
   
   
 
   
   
   
   
   
   
   
   
    

	
	
	

}
