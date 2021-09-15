package com.itrexgroup.konoplyanik.task2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task2Service {

	public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
		return Arrays.stream(text.split("\\s")).sorted().distinct().filter(x -> badWords.contains(x));
	}
}
