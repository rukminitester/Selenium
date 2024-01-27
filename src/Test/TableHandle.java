package Test;

import java.sql.Driver;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableHandle {

	private static final WebElement Element = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver() ;
			driver.get("https://www.dezlearn.com/webtable-example/");
			WebElement table=driver.findElement(By.tagName("table"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			for(int i=1;i<rows.size();i++)
		
		{
				List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
				System.out.println(i+"="+cols.size());
				for(int j=0;j<cols.size();j++) {
					if(i==1&&j==4) {
						WebElement colsElement=cols.get(j).findElement(By.tagName("select"));
					    Select dropdown=new Select(Element);
					    dropdown.selectByVisibleText("sport"); 
					    
					}
				}
		}
			
		}
	

	}

