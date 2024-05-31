package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.common_methodsselenium;

public class womens_page extends common_methodsselenium {
	
	private static final By jacket_pg_text = null;
	By women_tab = By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
	By jacket_tab = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a");
    By Jacket_page_txt = By.xpath("//*[@id=\"page-title-heading\"]/span");
    By Hoodies_Sweatshirts = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a");
	By Hoodies_Sweatshirts_page_txt = By.xpath("//*[@id=\"page-title-heading\"]/span");
	By Radiant_Tee = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div");
	By Radiant_Tee_size = By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
	By Shorts = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[2]/a");
	By Shorts_size = By.xpath("//*[@id=\"option-label-size-143-item-171\"]");
	
	
	
	public void vrfy_women_tab() {
		
		WebElement we1 = dr.findElement(women_tab);
		we1.click();
		WebElement we2= dr.findElement(Jacket_page_txt);
		String s1 = we2.getText();
		String s2 = "Jackets";
		if(s1.equals(s2)) {
			System.out.println("It is a men page");
		}
		else {
			System.out.println("Its not a mens page");
		}
		
		
	}
	
	public void vrfy_jacket_tab() {
		WebElement we1 = dr.findElement(women_tab);
		we1.click();
		
		WebElement we2 = dr.findElement(jacket_tab);
		we2.click();
	}
	
	public void vrfy_Hoodies_Sweatshirts() {
		WebElement we1 = dr.findElement(women_tab);
		we1.click();
		WebElement we2 = dr.findElement(Hoodies_Sweatshirts);
		we2.click();
		WebElement we3= dr.findElement(Hoodies_Sweatshirts_page_txt);
		String h1 = we3.getText();
		String h2 = "Hoodies & Sweatshirts";
		if(h1==h2) {
			System.out.println(" it is a Hoodies & Sweatshirts page");
		}
		else {
			System.out.println("Its not a Hoodies & Sweatshirts page");
		}
	}

		public void Verify_Radiant_Tee_size() {
			WebElement we1 = dr.findElement(women_tab);
			we1.click();
			WebElement we2 = dr.findElement(Radiant_Tee);
			we2.click();
			WebElement we3 = dr.findElement(Radiant_Tee_size);
			we3.click();
		}
		public void Verify_Shorts_size() {
			WebElement we1 = dr.findElement(women_tab);
			we1.click();
			WebElement we2 = dr.findElement(Shorts);
			we2.click();
			WebElement we3 = dr.findElement(Shorts_size);
			we3.click();
		}
			
		}
			
			
		
	

