package maven.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Apptest {
@Test
public void test() {
	//Assert.fail();
	Reporter.log("Hi", true);
}

}
