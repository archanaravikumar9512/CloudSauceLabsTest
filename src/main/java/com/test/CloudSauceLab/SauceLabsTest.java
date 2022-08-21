package com.test.CloudSauceLab;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	
	public static final String USERNAME = "oauth-archanaravikumar95-16539";

	  public static final String ACCESS_KEY = "xxxxx";

	 // public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 * DesiredCapabilities cap=DesiredCapabilities.chrome();
		 * cap.setCapability("platform", "windows 10"); cap.setCapability("version",
		 * "51.0"); WebDriver driver= new RemoteWebDriver(new java.net.URL(URL), cap);
		 * 
		 * driver.get("https://google.com/");
		 * System.out.println("get Title"+driver.getTitle());
		 */
        
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("build", "2");
		caps.setCapability("name", "Cloud Sauce Test");

		java.net.URL url = new java.net.URL( "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, caps);
		
		driver.get("https://google.com/");
		System.out.println("get Title: "+driver.getTitle());
	}
}