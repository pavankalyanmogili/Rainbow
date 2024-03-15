package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
@Test
public void login() {
	Reporter.log("login to application",true);
}
public void logout() {
	Reporter.log("logout from application",true);
}
}
