package com.adac.basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassAdac {
public static WebDriver driver;

public static void launch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
public static void urlLoad(String url) {
	driver.get(url);
}
public static  String getCurUrl() {
	return driver.getCurrentUrl();
}
public static WebElement searchElementById(String id) {
	return driver.findElement(By.id(id));
}
public static WebElement searchElementByXpath(String xpath) {
	return driver.findElement(By.xpath(xpath));
}
//Select (Handle the dropdown)
public static void selectByValue(WebElement elem , String value) {
	Select ss = new Select (elem);
	ss.selectByValue(value);
}

public static void selectByIndex(WebElement elem , int index) {
	Select ss = new Select (elem);
	ss.selectByIndex(index);
}

public static WebElement searchElementByName(String name) {
	return driver.findElement(By.name(name));
}

public static void scrShot(String location) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File(location);
	FileHandler.copy(src, des);
}

public static String getProp(String pf) throws IOException {
	File fl = new File("C:\\Users\\Muhamed Javeed\\Desktop\\ProjectMuhamedJaveed\\src\\test\\resources\\AllData\\adac.properties");
	FileInputStream fis = new FileInputStream(fl);
	Properties prp = new Properties();
	prp.load(fis);
	return prp.getProperty(pf);
}
public static void browserClose() {
	driver.close();
}
}
