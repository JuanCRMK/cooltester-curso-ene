package com.facebook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ejercicioBasico {

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void facebookTest() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://es-la.facebook.com/");
		driver.manage().window().maximize();

		// Validation - Hard Assertion
		Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
		System.out.println("Comparación titulo exitosa");
	
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://es-la.facebook.com/");
		System.out.println("Comparación URL exitosa");
			
	
		/*
		 * Locator
		 * text box correo electronico //input[@id='email']
		 * text box password           //input[@id='pass']
		 * boton iniciar sesion        //button[@name='login']
		 * boton olvidaste contraseña   //a[contains(@href, 'https://es-la.facebook.com/recover/')]
		 * label "Crea una página para una celebridad, una marca o un negocio."     //a[contains(@href, '/pages/create/?ref_type=registration')]
		 */
	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}
