package com.itrexgroup.konoplyanik.task3.service;

import java.util.stream.IntStream;

public class Task3Service {

	public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
		return IntStream.concat(evenStream, oddStream).sorted().filter(x -> x % 3 == 0 && x % 5 == 0).skip(2);
	}

}
