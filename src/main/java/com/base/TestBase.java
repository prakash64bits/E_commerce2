package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	
	String proppath="./src/main/java/config_file";
	private static FileInputStream file;
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		 prop=new Properties();
	try {
		file=new FileInputStream(proppath);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	try {
		prop.load(file);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	 public static void Initialization() {
		String browser = prop.getProperty("browser"); // key based

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chromedriver.driver", "C:\Users\admin\OneDrive\Desktop\jakkam.xlsx");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			 driver = new EdgeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("provide the valid browser name:");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.quit();
	}
}
