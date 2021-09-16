package com.itrexgroup.konoplyanik.task1.service;

import org.junit.Assert;
import org.junit.Test;

public class Task1ServiceTest {
	
	@Test
	public void isPrimeTest_Prime() {
		Assert.assertTrue(Task1Service.isPrime(41));
	}
	
	@Test
	public void isPrimeTest_NotPrime() {
		Assert.assertFalse(Task1Service.isPrime(38));
	}
	
}
