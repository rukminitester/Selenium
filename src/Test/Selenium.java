package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("ravi");
		driver.findElement(By.name("lastname")).sendKeys("ramu");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();

	}

}
