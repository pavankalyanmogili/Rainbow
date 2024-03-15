package Assertverify;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAsserts {




@Test
public void Tc1() {
	String str1="hi";
	String str2="hello";
	SoftAssert s=new SoftAssert();
	s.assertEquals(str1, str2);
	System.out.println("hi");
  s.assertAll();
}
  @Test
  public void Tc2() {
	  Reporter.log("hello",true);
  }
	


	
	
	
	
	
	
}
	





	



