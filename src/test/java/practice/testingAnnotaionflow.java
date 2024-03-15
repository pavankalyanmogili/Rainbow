package practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testingAnnotaionflow {
	@Test
	public void m1() {
		Reporter.log("hii",true);
	}
@BeforeSuite
public void m2() {
	Reporter.log("==DATABASE CONNECTION==",true);
}
@BeforeClass
public void m3() {
	Reporter.log("==LAUNCH THE BROWSER==",true);
}
@BeforeMethod
public void m4() {
	Reporter.log("==LOGIN TO APPLICATION==",true);
}
@AfterMethod
public void m5() {
	Reporter.log("==LOGOUT FROM APPLICATION==",true);
}
@AfterClass
public void m6() {
	Reporter.log("==CLOSE BROWSER==",true);
}
@AfterSuite
public void m7() {
	Reporter.log("==DATABASE DISCONNECTION",true);
}
}

