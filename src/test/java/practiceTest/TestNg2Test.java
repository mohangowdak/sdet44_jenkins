package practiceTest;

import org.testng.annotations.Test;

public class TestNg2Test {
	@Test
	public void test2() {
		System.out.println("Url of website ==> "+System.getProperty("url"));
		System.out.println("username of application ==> "+System.getProperty("username"));
	}

}
