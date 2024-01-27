package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class sep10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.switchTo().newWindow(WindowType.WINDOW.TAB);
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("the title of the page is="+title);
		driver.navigate().to("https://ww.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		driver.quit();

	}

}
