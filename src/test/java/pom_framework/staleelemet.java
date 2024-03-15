package pom_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class staleelemet {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
driver.navigate().refresh();
un.sendKeys("pavank122@gmail.com");
	}

}
