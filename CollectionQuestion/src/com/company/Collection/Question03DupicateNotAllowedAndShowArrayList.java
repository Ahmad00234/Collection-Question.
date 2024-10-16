package com.company.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Question03DupicateNotAllowedAndShowArrayList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the fruit names");
	String l1=sc.nextLine();
	String []spliting1=l1.split(" ");
	for (String string1 : spliting1) {
		System.out.println(string1);
	}
	HashSet hs = new HashSet();
	for (Object object : spliting1) {
		hs.add(object);
	}
	System.out.println(hs);
	TreeSet ts = new TreeSet();
		ts.addAll(hs);{
	System.out.println(ts);
	}

}

}