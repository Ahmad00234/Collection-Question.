package com.company.Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingQuestion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first line");
	String l1=sc.nextLine();
	String []spliting1=l1.split(" ");
//	for (String string1 : spliting1) {
//		System.out.println(string1);
//	}
	System.out.println("enter the second line");
	String l2=sc.nextLine();
	String [] spliting2=l2.split(" ");
//	for (String string2 : spliting2) {
//		System.out.println(string2);
//	}
	ArrayList al1 = new ArrayList();
	ArrayList al2 = new ArrayList();
	for (Object object1 : spliting1) {
		al1.add(object1);
	}
	for (Object object2 : spliting2) {
		al2.add(object2);
	}
	TreeSet ts = new TreeSet();
	for (Object object : al1) {
		ts.add(object);
	}
	for (Object object : al2) {
		ts.add(object);
	}
	System.out.println(ts);
}
}
