package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
@Test
public void logout() {
	Reporter.log("logout from application",true);
}
@Test(priority=1)
public void login() {
	Reporter.log("login to application",true);
}
}
