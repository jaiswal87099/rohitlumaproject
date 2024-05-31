package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.common_methodsselenium;

public class Gear_page extends common_methodsselenium {
	
	By gear_tab = By.xpath("//*[@id=\"ui-id-6\"]/span[2]");
	By gear_pg_title = By.xpath("//*[@id=\"page-title-heading\"]/span");
	By category_bag = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[1]/a");
	By bag_pg_title = By.xpath("//*[@id=\"page-title-heading\"]/span");
	By category_Fitness_Equipment = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[2]/a");
	By fitness_equipment_page_tile = By.xpath("//*[@id=\"page-title-heading\"]/span");
	By category_watches = By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[3]/a");
	By watches_pg_title = By.xpath("//*[@id=\"page-title-heading\"]/span");
	

	
	public void vrfy_gear_tab() {
		
		WebElement we1 = dr.findElement(gear_tab);
		we1.click();
		
		WebElement we2= dr.findElement(gear_pg_title);
		String s1 = we2.getText();
		String s2 = "Gear";
		if(s1.equals(s2)) {
			System.out.println("It is a gear page");
		}
		else {
			System.out.println("Its not a gear page");
		}
	}
		public void vrfy_category_bag() {
			
			WebElement we1 = dr.findElement(gear_tab);
			we1.click();
			
			WebElement we2 = dr.findElement(category_bag);
			we2.click();
			
			WebElement we3= dr.findElement(bag_pg_title);
			String s1 = we3.getText();
			String s2 = "Bags";
			if(s1.equals(s2)) {
				System.out.println("It is a bag page");
			}
			else {
				System.out.println("Its not a bag page");
			}
			}
		public void vrfy_category_Fitness_Equipment() {
			WebElement we1 = dr.findElement(gear_tab);
			we1.click();
		
			WebElement we2 = dr.findElement(category_Fitness_Equipment);
			we2.click();
			
			WebElement we3= dr.findElement(fitness_equipment_page_tile);
			String s1 = we3.getText();
			String s2 = "Fitness Equipment";
			if(s1.equals(s2)) {
				System.out.println("It is a Fitness Equipment page");
			}
			else {
				System.out.println("Its not a Fitness Equipment page");
			}
			}
		public void vrfy_category_watches() {
			
			WebElement we1 = dr.findElement(gear_tab);
			we1.click();
		
			WebElement we2 = dr.findElement(category_watches);
			we2.click();
			
			WebElement we3= dr.findElement(watches_pg_title);
			String s1 = we3.getText();
			String s2 = "Watches";
			if(s1.equals(s2)) {
				System.out.println("It is a Watches page");
			}
			else {
				System.out.println("Its not a Watches page");
			}
			}
			
		}
		
		
		
	

	
	
			


