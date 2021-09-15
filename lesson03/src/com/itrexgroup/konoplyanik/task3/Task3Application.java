package com.itrexgroup.konoplyanik.task3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.itrexgroup.konoplyanik.task3.service.Task3Service;

public class Task3Application {

	public static void main(String[] args) {
		
		IntStream evenStream = IntStream.of(2, 4);
		IntStream oddStream = IntStream.of(1, 3);
		
		System.out.println(Task3Service.createFilteringStream(evenStream, oddStream).boxed().collect(Collectors.toList()));
		
		evenStream = IntStream.of(30, 60, 90);
		oddStream = IntStream.of(75);
		
		System.out.println(Task3Service.createFilteringStream(evenStream, oddStream).boxed().collect(Collectors.toList()));
	}

}
