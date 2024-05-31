package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.common_methodsselenium;

public class add_to_cart_page extends common_methodsselenium {
	By men_tab = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By jackets_tab = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a");
    By Proteus_Fitness_Jackshirt =By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img");
    By sizes_xs = By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
    By colour = By.xpath("//*[@id=\"option-label-color-93-item-50\"]");
    By add_to_cart = By.xpath("//*[@id=\"product-addtocart-button\"]/span");
    
    
   public void vrfy_mans_tab_to_add_to_cart() {
		WebElement we1 = dr.findElement(men_tab);
		we1.click();
		
    }
		public void vrfy_jacket_tab() {
			WebElement we1 = dr.findElement(men_tab);
			we1.click();
			WebElement we2 = dr.findElement(jackets_tab);
			we2.click();
		}
			public void vrfy_Proteus_Fitness_Jackshirt() {
				WebElement we1 = dr.findElement(men_tab);
				we1.click();
				WebElement we2 = dr.findElement(jackets_tab);
				we2.click();
				WebElement we3 = dr.findElement(Proteus_Fitness_Jackshirt);	
				we3.click();
			}
				public void vrfy_sizes_xs() {
					WebElement we1 = dr.findElement(men_tab);
					we1.click();
					WebElement we2 = dr.findElement(jackets_tab);
					we2.click();
					WebElement we3 = dr.findElement(Proteus_Fitness_Jackshirt);
					we3.click();
					WebElement we4 = dr.findElement(sizes_xs);
					we4.click();
				}
					public void vrfy_colour () {
						WebElement we1 = dr.findElement(men_tab);
						we1.click();
						WebElement we2 = dr.findElement(jackets_tab);
						we2.click();
						WebElement we3 = dr.findElement(Proteus_Fitness_Jackshirt);
						we3.click();
						WebElement we4 = dr.findElement(sizes_xs);
						we4.click();
						WebElement we5 = dr.findElement(colour);
						we5.click();
					}
					public void add_to_cart() {
					
						WebElement we1 = dr.findElement(men_tab);
						we1.click();
						WebElement we2 = dr.findElement(jackets_tab);
						we2.click();
						WebElement we3 = dr.findElement(Proteus_Fitness_Jackshirt);
						we3.click();
						WebElement we4 = dr.findElement(sizes_xs);
						we4.click();
						WebElement we5 = dr.findElement(colour);
						we5.click();
						WebElement we6 = dr.findElement(add_to_cart);
						we6.click();
					
				}
				
				
		
		
    }
    
    
  
