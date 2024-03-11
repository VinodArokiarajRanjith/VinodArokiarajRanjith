package com.fb.web.pageObject;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
	
		String str = "coconut";
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		
		StringBuffer sb = new StringBuffer();
		for (Character c : set) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	
}
