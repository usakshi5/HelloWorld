package com.main.HelloWorld;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorldTest extends BaseClass{

	@Test
	public void test() {
		System.out.println("Hello World");
	}
	
	@BeforeTest
	public void initializeBrowser() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
