package com.company.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class findFrequencyOfElement {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	HashMap<String, Integer> hm = new HashMap<String,Integer>();
	
	al.add("apple");
	al.add("banana");
	al.add("apple");
	al.add("grape");
	al.add("apple");
	System.out.println(hm);
	
	for (String str : al) {
		if(!(hm.containsKey(str))) {
		hm.put(str,1);
	    } 
		else {
			hm.put(str, hm.get(str)+1);
		}
	}
	System.out.println(hm);
	System.out.println(al);
	HashSet<String> hs = new HashSet<String>();
	hs.add("apple");
	hs.add("banana");
	hs.add("apple");
	hs.add("grape");
	hs.add("apple");
	System.out.println(hs);
	
    HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
    hm1.put("apple",10);
    hm1.put("banana",12);
    hm1.put("apple",10);
    hm1.put("grape",14);
    hm1.put("apple",24);
    System.out.println(hm1);
   System.out.println( hm1.get("banana")+12);

}
}

