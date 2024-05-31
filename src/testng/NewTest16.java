package testng;

import org.testng.annotations.Test;

import pageobject.Gear_page;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest16 extends Gear_page {
  @Test
  public void Tc_0024() {
	  
	  vrfy_gear_tab();
  }
  
  @Test
public void Tc_0025() {
	  
	  vrfy_category_bag();
  }
  
 @Test
  public void Tc_0026() {
	  vrfy_category_Fitness_Equipment();
  }
  @Test
  public void Tc_0027() {
  vrfy_category_watches();
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
  

