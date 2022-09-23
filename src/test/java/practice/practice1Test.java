package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice1Test {
	
	@Test
	public void practice1mavenTest(){
		String browser = System.getProperty("br");
		String url = System.getProperty("url");
		Reporter.log("practice1", true);
		
	}

}
