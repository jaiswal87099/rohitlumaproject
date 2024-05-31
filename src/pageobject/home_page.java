package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.common_methodsselenium;

public class home_page extends common_methodsselenium {
	
	
		
		By men_tab = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
		By men_pg_title = By.xpath("//*[@id=\"page-title-heading\"]/span");
		
		By women_tab = By.xpath("//*[@id=\'ui-id-4\']/span[2]");
		By women_pg_title = By.xpath("//*[@id=\'page-title-heading\']/span");
		
		By Whatsnew_tab = By.xpath("//*[@id=\'ui-id-3\']/span");
		By Whatsnew_tab_title = By.xpath("//*[@id=\'page-title-heading\']/span");
		
		By cart_btn = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
		By cart_msg = By.xpath("//*[@id=\'minicart-content-wrapper\']/div[2]/strong");
		
		By searchbox = By.xpath("//*[@id=\'search\']");
		By search_rslt_pgtitle = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
	
		public void vrfy_men_tab() {
			
			WebElement we1 = dr.findElement(men_tab);
			we1.click();
			
			WebElement we2= dr.findElement(men_pg_title);
			String s1 = we2.getText();
			String s2 = "Men";
			if(s1.equals(s2)) {
				System.out.println("It is a men page");
			}
			else {
				System.out.println("Its not a mens page");
			}
			
		}
		
		public void vrfy_women_tab() {
			
			WebElement we1 = dr.findElement(women_tab);
			we1.click();
			
			WebElement we2= dr.findElement(women_pg_title);
			String s1 = we2.getText();
			String s2 = "Women";
			if(s1.equals(s2)) {
				System.out.println("It is a Women page");
			}
			else {
				System.out.println("Its not a Womens page");
			}
			
		}
		
		public void vrfy_Whatsnew_tab() {
			
			WebElement we1 = dr.findElement(Whatsnew_tab);
			we1.click();
			
			WebElement we2= dr.findElement(Whatsnew_tab_title);
			String s1 = we2.getText();
			String s2 = "What's New";
			if(s1.equals(s2)) {
				System.out.println("It is a What's New page");
			}
			else {
				System.out.println("Its not a What's New page");
			}
		}
		
		public void Verify_empty_cart() {
			
			WebElement we1 = dr.findElement(cart_btn);
			we1.click();
			
			WebElement we2= dr.findElement(cart_msg);
			String s1 = we2.getText();
			String s2 = "You have no items in your shopping cart.";
			if(s1.equals(s2)) {
				System.out.println("Empty cart success");
			}
			else {
				System.out.println("Empty cart not success");
			}
				
		}
		
		public void Searchbox() {
			
			WebElement we1 = dr.findElement(searchbox);
			we1.sendKeys(read_excel(0,0));
			Actions builder1 = new Actions(dr);
			  builder1
			         .keyDown(Keys.ENTER)
			         .keyUp(Keys.ENTER)
			         .build().perform();
			
			WebElement we2= dr.findElement(search_rslt_pgtitle);
			String s1 = we2.getText();
			String s2 = read_excel(1,0);
			if(s1.equals(s2)) {
				System.out.println("Searchbox is success");
			}
			else {
				System.out.println("Search box is not success");
			}
			
			
		
		
		}	

	}
	
	

	


