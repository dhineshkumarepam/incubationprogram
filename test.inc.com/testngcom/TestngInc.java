package testngcom;

import org.testng.annotations.Test;

public class TestngInc {

	@Test (groups= {"smoke"})
	private void testing() {
System.out.println("the test is passed");
	}
	@Test(groups= {"smoke"})
	private void testing1() {
System.out.println("the test1 is passed");
	}
	@Test(groups= {"smoke"})
	private void testing2() {
		System.out.println("the test2 is passed");
			}
	@Test(groups= {"regression"})
	private void testing3() {
		System.out.println("the test3 is passed");
			}
	@Test(groups= {"regression"})
	private void testing4() {
		System.out.println("the test4 is passed");
			}

}
