package com.itrexgroup.konoplyanik.task2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2ServiceTest {
	private List<String> badWords;
	
	@Before
	public void setBadWords() {
		badWords = Arrays.asList("bob", "man", "ray");
	}
	
	@Test
	public void createBadWordsDetectingStreamTest() {
		String text = "bob bill carl bob man fill dan man";

		List<String> words = Arrays.asList("bob", "man");
		
		Assert.assertEquals(Task2Service.createBadWordsDetectingStream(text, badWords).collect(Collectors.toList()), words);
	}
	
}
