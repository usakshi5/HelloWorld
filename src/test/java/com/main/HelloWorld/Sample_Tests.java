package com.main.HelloWorld;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_Tests {
	@Test
	public void test() {
		Sample sam=new Sample();
		System.out.println("Sample tests");
		Assert.assertEquals("hello", sam.hello());
	}

}
