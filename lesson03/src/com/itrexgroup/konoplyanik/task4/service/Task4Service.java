package com.itrexgroup.konoplyanik.task4.service;

import java.util.stream.LongStream;

public class Task4Service {
	
	public static long factorial(long n) {
        return LongStream.rangeClosed(1, n).reduce((x, y) -> x * y).orElse(1);
    }

}
