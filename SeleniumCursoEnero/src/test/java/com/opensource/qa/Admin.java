package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

public class Admin {

	// Instancias de objeto
	String username, password, passwordIncorrect, msgNoRecords, userNotExist, newEmployee, newUser, newpassword,
			msgDeleteRecord, userStatus, verifyMessage;

	int x = (int) Math.floor(Math.random() * 90 + 1);

	@BeforeTest
	public void beforeTest() {

		// Test Data
		username = "Admin";
		password = "admin123";
		passwordIncorrect = "admin1234";
		userNotExist = "XYZ";
		msgNoRecords = "No Records Found";
		newEmployee = "Admin A";
		newUser = "JC Ramirez1";
		newpassword = "Hola12345678";
		msgDeleteRecord = "Delete records?";
		userStatus = "Disabled";
		verifyMessage = "Invalid credentials";

	}

	@AfterTest
	public void afterTest() {
	}

	@Test
	public void tc001AdminSearchEmployee() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Seleccionar un campo obligatorio

		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, username);
		
		//prueba para tabla
		WebElement table = driver.findElement(By.xpath("//tbody"));
		System.out.println(table.getSize());

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Close Browser");
		driver.close();

	}

	@Test
	public void tc002AdminSearchEmployeeNotExist() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userNotExist);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verify username exist in table");

		// AssertEquals
		String actualValue = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecords);
	

		// AssertTrue
		boolean isDisplayed = driver.findElement(By.xpath("//*[text()='" + msgNoRecords + "']")).isDisplayed();
		Assert.assertTrue(isDisplayed);

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Close Browser");
		driver.close();

	}

	@Test
	public void tc003AdminAddNewUser() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add Button");
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6
		Reporter.log("Enter a Valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);

		// Step 7
		Reporter.log("Enter a Valid User Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newUser);

		// Step 8
		Reporter.log("Enter new password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(newpassword);

		// Step 9
		Reporter.log("Enter  confirm password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(newpassword);

		// Step10
		Reporter.log("Click Save");
		// Explicit wait
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnSave']")));
//		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		boolean jr1 = isElementPresent(By.xpath("//input[@id='btnSave']"));
		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		if (jr1 == false) {
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnSave']")));
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		} else if (jr1 == true) {
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		} else {
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnSave']")));
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}

		// Dar clic en botón que no esta sincronizado con JAVASCRIPT
//		WebElement element = driver.findElement(By.xpath("//input[@id='btnSave']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",element);

		// Step 11
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newUser);

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13
		Reporter.log("Verify username exist in table");

		// AssertEquals
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, newUser);

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();

	}

	private boolean isElementPresent(By by) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.findElement(By.xpath("//input[@id='btnSave']"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	@Test
	public void tc004AdminDeleteUser() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Seleccionar un campo obligatorio

		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, newUser);

		// Step 8
		Reporter.log("Select User");
		driver.findElement(By.xpath("//input[@name='chkSelectRow[]']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Click Delete");
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 10
		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
		String actualValue2 = driver
				.findElement(By.xpath("//div[@class='modal hide in'][@id='deleteConfModal']/div[2]/p")).getText();
		Assert.assertEquals(actualValue2, msgDeleteRecord);

		// Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 12
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

		// Step 13
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 14
		Reporter.log("Validate in table that user was delete successfully");

		// AssertEquals
		String actualValue3 = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue3, msgNoRecords);

		// AssertTrue
		boolean isDisplayed = driver.findElement(By.xpath("//*[text()='" + msgNoRecords + "']")).isDisplayed();
		Assert.assertTrue(isDisplayed);

		// Step 15
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 16
		Reporter.log("Close Browser");
		driver.close();

	}

	@Test
	public void tc005CreateUserDisabled() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add Button");
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6
		Reporter.log("Enter a Valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);

		// Step 7
		Reporter.log("Enter a Valid User Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newUser);

		// Step 8
		Reporter.log("Change Status Disabled");
		driver.findElement(By.xpath("//select[@id='systemUser_status']/option[2]")).click();

		// Step 9
		Reporter.log("Enter new password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(newpassword);

		// Step 10
		Reporter.log("Enter  confirm password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(newpassword);

		// Step 11
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 12
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newUser);

		// Step 13
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 14
		Reporter.log("Verify username is Disabled Status in table");

		// AssertEquals
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[5]")).getText();
		Assert.assertEquals(actualValue, userStatus);

		// Step 15
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 16
		Reporter.log("Close Browser");
		driver.close();

	}

	@Test
	public void tc007ValidateInvalidPassword() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(passwordIncorrect);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Verify error message when enter invalid password");
		String emessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		Assert.assertEquals(emessage, verifyMessage);

		// Step 4
		Reporter.log("Close Browser");
		driver.close();

	}

}
