package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2934&ru=");
		
		Xls_Reader reader = new Xls_Reader("/home/anurag/Documents/workspace-sts-3.9.7.RELEASE/DatadrivenPOM/src/main/java/com/testdata/HalfEbayTestData.xlsx");
	}

}
