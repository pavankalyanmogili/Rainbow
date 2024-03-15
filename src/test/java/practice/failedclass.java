package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedclass {
@Test
public void tc1() {
	Reporter.log("hi...",true);
}
@Test
public void tc2() {
	Reporter.log("goodmrg",true);
	Assert.fail();
}
}
