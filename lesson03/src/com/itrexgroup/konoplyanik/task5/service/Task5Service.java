package com.itrexgroup.konoplyanik.task5.service;

import java.util.stream.LongStream;

public class Task5Service {

	public static long sumOfOddNumbersInRange(long start, long end) {
		return LongStream.rangeClosed(start, end).filter(x -> x % 2 != 0).sum();
	}

}
