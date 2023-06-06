package com.rays.CollectionFramWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E_Stream5 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

//		Stream<String> Stream = list.stream();
//		Stream.forEach(e -> {
//			System.out.println("stream string type ka object deta hai = " + e + " ");
//		});

//		System.out.println("-------");
//		list.stream().sorted().forEach(e -> {
//			System.out.println("sorted = " + e);
//		});

		System.out.println("@@@@");
		list.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println("map = " + e);
		});

		System.out.println("*******");
		list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e -> {
			System.out.println("filter = " + e);
		});
	}

}
