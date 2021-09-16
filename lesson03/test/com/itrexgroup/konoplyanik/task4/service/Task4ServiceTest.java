package com.itrexgroup.konoplyanik.task4.service;

import org.junit.Assert;
import org.junit.Test;

public class Task4ServiceTest {
	
	@Test
	public void factorialTest_Zero() {
		Assert.assertEquals(Task4Service.factorial(0), 1);
	}
	
	@Test
	public void factorialTest() {
		Assert.assertEquals(Task4Service.factorial(5), 120);
	}
	
}
