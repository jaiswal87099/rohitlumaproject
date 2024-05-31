package testng;

import org.testng.annotations.Test;

import pageobject.womens_page;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest13 extends womens_page {
  @Test
  
  public void Tc_006() {
	  vrfy_women_tab();
  }
  @Test
  public void Tc_007() {
	  vrfy_jacket_tab();
  }
  @Test
  public void Tc_008() {
	  vrfy_Hoodies_Sweatshirts();
  }
  @Test
  public void Tc_009() {
	  Verify_Radiant_Tee_size();
  }
  @Test
  public void Tc_0010() {
	  Verify_Shorts_size();
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
