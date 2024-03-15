package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeouts {
@Test (timeOut=10)
public void m1() {
	Reporter.log("hello",true);
}
}
