package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.common_methodsselenium;

public class men_page extends common_methodsselenium {
	
	By men_tab = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By Top_tab = By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a");
	By category_tab = By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]");
	By style_tab = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]");
	By light_weight = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[3]/a");
	By Size_tab = By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[1]");
	By colour_tab = By.xpath("//*[@id=\"narrow-by-list\"]/div[5]/div[1]");
	
	
	public void vrfy_men_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
	}
	public void vrfy_Top_tab()	{
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
	
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
		
	}
	
	public void vrfy_category_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
		
		WebElement we3 = dr.findElement(category_tab);
		we3.click();
		
	}
	
	public void vrfy_style_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
		
		WebElement we3 = dr.findElement(style_tab);
		we3.click();
		
	}
	
	public void vrfy_lightweight_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
		WebElement we3 = dr.findElement(style_tab);
		we3.click();
		
		
		WebElement we4 = dr.findElement(light_weight);
		we4.click();
		
	}
	
	public void vrfy_size_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
	
		WebElement we3 = dr.findElement(Size_tab);
		we3.click();
		
	}
	
	public void vrfy_colour_tab() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		WebElement we2 = dr.findElement(Top_tab);
		we2.click();
		
		WebElement we3 = dr.findElement(colour_tab);
		we3.click();
		
	}
		
	
	
	

}
