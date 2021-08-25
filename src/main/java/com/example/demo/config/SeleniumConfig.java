package com.example.demo.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfig {
	 private WebDriver driver;
	 public SeleniumConfig() {

		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		static {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratapGurung\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}

		public WebDriver getDriver() {
			return driver;
		}


		
		
}
