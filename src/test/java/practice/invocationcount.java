package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
@Test (invocationCount=10)

public void demo() {
	Reporter.log("hi good mrg",true);
}
}
