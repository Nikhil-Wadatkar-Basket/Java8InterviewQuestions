package com.bs.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		String str = "Nikhil Wadatkar";

//		find first repeating character of the string.
//		find occurence of each character
		str = str.replaceAll(" ", "");
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] stringArray = str.split("");

		for (int i = 0; i < stringArray.length; i++) {
			if (map.containsKey(stringArray[i])) {
				map.put(stringArray[i], map.get(stringArray[i]) + 1);
			} else {
				map.put(stringArray[i], 1);
			}
		}

		System.out.println(map);// {a=3, r=1, d=1, t=1, W=1, h=1, i=2, k=2, l=1, N=1}

//		Map<String, Long> collect = Arrays.stream(stringArray)
//				.collect(Collectors.groupingBy(str1 -> str1, Collectors.counting()));
//		System.out.println(collect);

		for (Map.Entry<String, Integer> mm : map.entrySet()) {
			if (mm.getValue() > 1) {
				System.out.println("First reoeating character is "+mm.getKey());
				break;
			}
		}
	}

}
