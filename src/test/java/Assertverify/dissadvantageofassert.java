package Assertverify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dissadvantageofassert {
@Test
public void Tc1() {
	Reporter.log("i am verification 1",true);
	Assert.fail();
	Reporter.log("i am verification 2",true);
}
@Test
public void Tc2() {
	Reporter.log("i am verification 3",true);
}
}