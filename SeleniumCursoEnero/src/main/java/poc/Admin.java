package poc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;

public class Admin extends Base {

	public Admin(WebDriver driver) {
		super(driver);
	}

	/*
	 * Objects
	 */
	WebDriver driver;

	private By lnkAdminHeader = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	private By txtUsername = By.id("searchSystemUser_userName");
	private By btnSearch = By.id("searchBtn");
	private By tblUsername = By.xpath("//tbody/tr[1]/td[1]");
	private By tblUserNotExit = By.xpath("//tbody/tr");
	private By btnAdd = By.xpath("//input[@id='btnAdd']");
	private By txtTypeEmployee = By.xpath("//*[@id=\"systemUser_employeeName_empName\"]");
	private By txtNewUser = By.xpath("//*[@id=\"systemUser_userName\"]");
	private By txtNewPassword = By.xpath("//*[@id=\"systemUser_password\"]");
	private By txtConfirmPwd = By.xpath("//*[@id=\"systemUser_confirmPassword\"]");
	private By btnSave = By.xpath("//input[@id='btnSave']");
	By cbSelectUser = By.xpath("//input[@name='chkSelectRow[]']");
	By btnDelete = By.xpath("//input[@id='btnDelete']");
	private By ddDeleteConfirm = By.xpath("//div[@class='modal hide in'][@id='deleteConfModal']/div[2]/p");
	By btnDeleteConfirm = By.xpath("//input[@id='dialogDeleteBtn']");
	By addStatus = By.xpath("//select[@id='systemUser_status']/option[2]");
	By txtExists = By.xpath("//span[@for='systemUser_userName']");

	/*
	 * Customize methods
	 */
	public void searchUser(String username) {
		reporterLog("Searching username..." + username);
		click(lnkAdminHeader);
		type(txtUsername, username);
		click(btnSearch);
		implicitWait();
	}
	
	public void goTableAdmin() {
		reporterLog("go to Table Admin...");
		click(lnkAdminHeader);
	}

	public void validateUsernameTable(String expectedUser) {
		reporterLog("Validate username " + expectedUser);
		String actualUsername;
		int row = getSize(By.xpath("//tbody/tr"));
		int column = getSize(By.xpath("//tbody/tr[1]/td"));
		System.out.println(row);
		System.out.println(column);
		boolean v = false;
		while (v == false) {
			for (int j = 1; j <= row; j++) {
				for (int i = 1; i <= column; i++) {
					implicitWait();
					actualUsername = getText(By.xpath("//tbody/tr["+j+"]/td["+i+"]"));
					System.out.println(actualUsername);
					if (actualUsername.equalsIgnoreCase(expectedUser)) {
						Assert.assertEquals(actualUsername, expectedUser);
						v = true;
						return;
					}
				}
			}
		}

	}

	public void validateUserNotExistTable(String MsgExpect) {
		reporterLog("Verify username not Exist...");
		String registro = getText(tblUserNotExit);
		Assert.assertEquals(registro, MsgExpect);
	}

	public void addUser(String typeEmployee, String newUser, String newPwd) {
		reporterLog("Added new user..." + newUser);
		click(lnkAdminHeader);
		click(btnAdd);
		type(txtTypeEmployee, typeEmployee);
		type(txtNewUser, newUser);
		type(txtNewPassword, newPwd);
		type(txtConfirmPwd, newPwd);

		waitForElementPresent(btnSave);
		boolean jr1 = isElementPresent(btnSave);

		if (jr1 == false) {
			waitForElementPresent(btnSave);
			click(btnSave);
		} else if (jr1 == true) {
			click(btnSave);
		} else {
			click(btnSave);
		}
	}

	public void addUser(String typeEmployee, String newUser, String newPwd, String status) {
		reporterLog("Added new user..." + newUser);
		click(lnkAdminHeader);
		click(btnAdd);
		type(txtTypeEmployee, typeEmployee);
		type(txtNewUser, newUser);
		click(addStatus);
		String existe = getText(txtExists);
		// crear metodo que evalue si existe usuario
		type(txtNewPassword, newPwd);
		type(txtConfirmPwd, newPwd);
		String test = status;
		System.out.println(test);

		waitForElementPresent(btnSave);
		boolean jr1 = isElementPresent(btnSave);

		if (jr1 == false) {
			waitForElementPresent(btnSave);
			click(btnSave);
		} else if (jr1 == true) {
			click(btnSave);
		} else {
			click(btnSave);
		}
	}

	private boolean isElementPresent(By by) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void deleteUser(String msgDeleteRecord) {
		reporterLog("Delete user...");
		click(cbSelectUser);
		click(btnDelete);
		waitForElementPresent(ddDeleteConfirm);
		String value = getText(ddDeleteConfirm);
		Assert.assertEquals(value, msgDeleteRecord);
		implicitWait();
		click(btnDeleteConfirm);

	}

}
