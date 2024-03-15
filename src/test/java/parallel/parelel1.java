package parallel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parelel1 {
  WebDriver driver=new ChromeDriver();
  @Test
  public void tc1() {
  driver.get("https://www.facebook.com");
  }

}