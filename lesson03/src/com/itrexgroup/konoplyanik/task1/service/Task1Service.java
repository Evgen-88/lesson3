package com.itrexgroup.konoplyanik.task1.service;

import java.util.stream.LongStream;

public class Task1Service {

	public static boolean isPrime(final long number) {
		return LongStream.range(2, number).noneMatch(x -> number % x == 0);
	}
}
