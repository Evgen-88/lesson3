package com.itrexgroup.konoplyanik.task5.service;

import org.junit.Assert;
import org.junit.Test;

public class Task5ServiceTest {
	
	@Test
	public void sumOfOddNumbersInRangeTest_Zero() {
		Assert.assertEquals(Task5Service.sumOfOddNumbersInRange(0, 0), 0);
	}
	
	@Test
	public void sumOfOddNumbersInRangeTest() {
		Assert.assertEquals(Task5Service.sumOfOddNumbersInRange(21, 30), 125);
	}
	
}
