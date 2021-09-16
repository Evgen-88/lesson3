package com.itrexgroup.konoplyanik.task3.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class Task3ServiceTest {
	
	@Test
	public void createFilteringStreamTest() {
		IntStream evenStream = IntStream.of(30, 60, 90);
		IntStream oddStream = IntStream.of(75);
		
		List<Integer> expected = Arrays.asList(75, 90);
		
		Assert.assertEquals(Task3Service.createFilteringStream(evenStream, oddStream).boxed().collect(Collectors.toList()), expected);
	}
	
}
