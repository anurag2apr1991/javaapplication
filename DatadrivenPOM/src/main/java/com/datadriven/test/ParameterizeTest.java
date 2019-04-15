package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader(
				"/home/anurag/Documents/workspace-sts-3.9.7.RELEASE/DatadrivenPOM/src/main/java/com/testdata/HalfEbayTestData.xlsx");

		System.setProperty("webdriver.chrome.driver", "/home/anurag/Documents/workspace-sts-3.9.7.RELEASE/DatadrivenPOM/src/main/java/com/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2934&ru=");
		
		int rowCount = reader.getRowCount("RegTestData");
		//parametrization:
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);
			
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastName);
			
			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			System.out.println(address1);
			
			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			System.out.println(address2);

			String state = reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);
			
			String city = reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);

			String zipCode = reader.getCellData("RegTestData", "zipcode", rowNum);
			System.out.println(zipCode);
			
			String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
			System.out.println(emailAddress);
			
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();			
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
			
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
			
			driver.findElement(By.xpath("//*[@id='address1']")).clear();
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);
			
			driver.findElement(By.xpath("//*[@id='address2']")).clear();
			driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);
			
			driver.findElement(By.xpath("//*[@id='city']")).clear();
			driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
			
			Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
			
			select.selectByVisibleText(state);
			
			driver.findElement(By.xpath("//*[@id='zip']")).clear();
			driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);
			
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailAddress);

			driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
			driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailAddress);
		}

	}

}
