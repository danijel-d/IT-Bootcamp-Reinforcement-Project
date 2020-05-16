package page.test;

import java.util.List;

import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;

public class start { 

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("testng.xml");
		testng.setTestSuites(suites);
		testng.run();
		
	}
}
