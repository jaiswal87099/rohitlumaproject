package testng;

import org.testng.annotations.Test;

import pageobject.home_page;
import utilities.common_methodsselenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class NewTest12 extends home_page  {
	 @Test
	  public void Tc_001() {
		  
		  vrfy_men_tab();
	  }
	  
	  @Test
	  public void Tc_002() {
		  
		  vrfy_women_tab();
	  }
	  
	  @Test
	  public void Tc_003() {
		  
		  vrfy_Whatsnew_tab();
	  }
	  
	  @Test
	  public void Tc_004() {
		  
		  Verify_empty_cart();
	  }
	  
	  @Test
	  public void Tc_005() {
		  
		  Searchbox();
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() throws IOException {
		  
		  launch_app();
	  }

	  @AfterMethod
	  public void afterMethod() {
   
		//dr.quit();	
		
	}

	}