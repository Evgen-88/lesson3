package com.itrexgroup.konoplyanik.task2;

import java.util.*;
import java.util.stream.Collectors;

import com.itrexgroup.konoplyanik.task2.service.Task2Service;


public class Task2Application {

	public static void main(String[] args) {
		String text = "bob bill carl bob man fill dan man";
		List<String> badWords = new ArrayList<>();
		badWords.add("bob");
		badWords.add("man");
		badWords.add("ray");
		
		System.out.println(Task2Service.createBadWordsDetectingStream(text, badWords).collect(Collectors.toList()));
	}

}
