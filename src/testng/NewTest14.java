package testng;

import org.testng.annotations.Test;

import pageobject.men_page;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest14 extends men_page {
	@Test
	public void Tc_0011() {
		vrfy_men_tab();
	}
 @Test
 public void Tc_0012() {
	  
	 vrfy_Top_tab();
 }
 
 @Test
 public void Tc_0013() {
	  
	 vrfy_category_tab();
 }
 
 @Test
 public void Tc_0014() {
	  
	 vrfy_style_tab();
 }
 
 @Test
 public void Tc_0015() {
	  
	 vrfy_lightweight_tab();
 }
 
 @Test
 public void Tc_0016() {
	  
	 vrfy_size_tab();
 }
 @Test
 public void Tc_0017() {
	 vrfy_colour_tab();
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
