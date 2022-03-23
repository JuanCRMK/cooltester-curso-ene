package com.opensource.qa;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import poc.Admin;
import base.Base;
import poc.Login;

public class AdminPOM {
	/*
	 * Objects instances
	 */

	WebDriver driver;
	Base base;
	Login login;
	Admin admin;
	String username, password, msgNoRecords, userNotExist, typeEmployee, newUser, newPassword, msgDeleteRecord, status, userSearch;
	String jsonCredentials = "Credentials";
	String jsonAdminTestData = "AdminTestData";

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		base = new Base(driver);
		driver = base.chromeDriverSetup();
		login = new Login(driver);
		admin = new Admin(driver);

		// Test Data
		username = base.getJSONData(jsonCredentials, "username");
		password = base.getJSONData(jsonCredentials, "password");
		userNotExist = base.getJSONData(jsonAdminTestData, "userNotExist");
		msgNoRecords = base.getJSONData(jsonAdminTestData, "msgNoRecords");
		typeEmployee = base.getJSONData(jsonAdminTestData, "typeEmployee");
		newUser = base.getJSONData(jsonCredentials, "newUser");
		newPassword = base.getJSONData(jsonCredentials, "newPassword");
		msgDeleteRecord = base.getJSONData(jsonAdminTestData, "msgDeleteRecord");
		status = base.getJSONData(jsonAdminTestData, "status");
		userSearch = base.getJSONData(jsonAdminTestData, "userSearch");

	}

	@Test
	public void tc001AdminSearchEmployeePOM() {

		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6
		admin.goTableAdmin();

		// STEP 7
		admin.validateUsernameTable(userSearch);

		// STEP 8, 9
		login.logOut();
	}

	@Test
	public void tc002AdminSearchEmployeeNotExistPOM() {
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6
		admin.searchUser(userNotExist);

		// STEP 7
		admin.validateUserNotExistTable(msgNoRecords);

		// STEP 8, 9
		login.logOut();

	}

	@Test
	public void tc003AdminAddNewUserPOM() {
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6, 7, 8, 9, 10
		admin.addUser(typeEmployee, newUser, newPassword);

		// STEP 11, 12
		admin.searchUser(newUser);

		// STEP 13
		admin.validateUsernameTable(newUser);

		// SETP 14, 15
		login.logOut();
	}

	@Test
	public void tc004AdminDeleteUserPOM() {
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 5, 6
		admin.searchUser(newUser);

		// STEP 7
		admin.validateUsernameTable(newUser);

		// STEP 8, 9 ,10, 11
		admin.deleteUser(msgDeleteRecord);

		// STEP 12, 13
		admin.searchUser(newUser);

		// STEP 14
		admin.validateUserNotExistTable(msgNoRecords);

		// STEP 8, 9
		login.logOut();
	}
	
	@Test
	public void tc005CreateUserDisablePOM() {
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6, 7, 8, 9, 10
		admin.addUser(typeEmployee, newUser, newPassword);

		// STEP 11, 12
		admin.searchUser(newUser);

		// STEP 13
		admin.validateUsernameTable(newUser);

		// SETP 14, 15
		login.logOut();
	}

	

	@AfterTest
	public void afterTest() {
	}

}
