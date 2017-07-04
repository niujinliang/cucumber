package com.young.cucumber;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Search {
	public AppiumDriver<WebElement> driver;
	public String baseUrl;

	//初始化浏览器操作
	public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","appium-test-avd");
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("browserName", "Browser");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        baseUrl = "https://m.baidu.com/";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	//打开url
	public void open() {
		try {
			setUp();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.get(baseUrl);
	}

	//查找cucumber是不是显示了
	public String find(String keyword) {
		String result = null;
		WebElement element = null;

		driver.findElement(By.id("index-kw")).clear();
		driver.findElement(By.id("index-kw")).sendKeys(keyword);
		driver.findElement(By.id("index-bn")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		element = driver.findElement(By.id("results"));
		if (element.getText().contains("cucumber")) {
			result = "cucumber";
		}
		quit();
		return result;
	}

	//释放资源
	public void quit() {
		driver.quit();
	}
}