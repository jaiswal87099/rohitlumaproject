package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class common_methodsselenium {
	
	 private static final Logger logger = LogManager.getLogger(Main.class);

		static public  WebDriver dr;
		
		static public String read_excel(int r, int c) 
		{
			
			File f = new File("testdata.xlsx");
			FileInputStream fis = null;
			XSSFWorkbook wb = null;
			try {
				fis = new FileInputStream(f);
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
				
			}
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			XSSFSheet sh = wb.getSheetAt(0);
			
			XSSFRow row = sh.getRow(r);
			XSSFCell cell = row.getCell(c);
			
			String str = cell.getStringCellValue();
		    return str;
		}
		
		
		    public static void launch_app()
		    {
			System.setProperty("webdriver.chromedriver", "chrome_v123driver");
			dr = new ChromeDriver();
			dr.get("https://magento.softwaretestingboard.com/");
			dr.manage().window().maximize();
			//dr.quit();
		}



		public static void login(String uid, String pwd) {
			
			 dr.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(uid);
			 dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pwd);
			 dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		}

		}

	


