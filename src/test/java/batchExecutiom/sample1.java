package batchExecutiom;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
@Test
public void Tc1() {
	Reporter.log("i am Tc1",true);
	Assert.fail();
}
@Test
public void Tc2 () {
	Reporter.log("i am Tc2",true);
}
@Test
public void Tc3 () {
	Reporter.log("i am Tc3",true);
}
}
