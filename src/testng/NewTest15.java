package testng;

import org.testng.annotations.Test;

import pageobject.add_to_cart_page;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest15 extends add_to_cart_page {
  @Test
	public void Tc_0018() {
	  vrfy_mans_tab_to_add_to_cart();
	}
  @Test
  public void Tc_0019() {
	  vrfy_jacket_tab();
	}
  @Test
  public void Tc_0020() {
	  vrfy_Proteus_Fitness_Jackshirt();
	}
  @Test
  public void Tc_0021() {
	  vrfy_sizes_xs();
	}
  @Test
  public void Tc_0022() {
	  vrfy_colour () ;
	}
  @Test
  public void Tc_0023() {
  add_to_cart();
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

  
