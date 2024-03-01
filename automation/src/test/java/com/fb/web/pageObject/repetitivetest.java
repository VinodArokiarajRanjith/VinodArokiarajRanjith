package com.fb.web.pageObject;

import java.util.HashMap;
import java.util.Map;

public class repetitivetest {
	public static void main(String[] args) {
		String name = "Photon Interactive";
		char[] charArray = name.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			} else {
				charmap.put(c, 1);
			}
		}
		System.out.println(charmap);
	}
	
}
