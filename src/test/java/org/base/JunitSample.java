package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitSample {
	
	
	@Test
public void tc01() {
		
		String s="Hanno";
		
		System.err.println("Test1");
		
		boolean contains = s.contains("h");
		
		Assert.assertTrue(contains);
		
		System.out.println(contains);
	
}
	
	@Test
public void tc02() {
		
		String s="Hanno";
		
		System.err.println("Test2");
		
		boolean contains = s.contains("H");
		
		Assert.assertFalse(contains);
		
		System.out.println(contains);
		
}
	
	@Test
public void tc03() {
		
		String s="Hanno";
		
		System.err.println("Test3");
		
		boolean contains = s.contains("h");
		
		Assert.assertEquals(true, contains);;
		
		System.out.println(contains);
	
	
}
	
}
