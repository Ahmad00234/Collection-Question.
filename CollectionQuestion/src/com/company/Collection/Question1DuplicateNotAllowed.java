package com.company.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Question1DuplicateNotAllowed {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("User enter the first list");
	String pl1=sc.nextLine();
	
	String []playlistsong1=pl1.split(" ");
	for (String string : playlistsong1) {
		System.out.println(string+"song1");
	}
	System.out.println("User enter the second list");
	String pl2=sc.nextLine();
	String []playlistsong2=pl2.split(" ");
	for (String string : playlistsong2) {
		System.out.println(string+"song2");
	}
	ArrayList al1 = new ArrayList();
	ArrayList al2 = new ArrayList();
	for (Object object1 : playlistsong1) {
		al1.add(object1);
	}
	for (Object object2 : playlistsong2) {
		al2.add(object2);
	}
	HashSet hs = new HashSet();
	for (Object object : al1) {
		hs.add(object);
	}
	for (Object object : al2) {
		hs.add(object);
		
	}
	System.out.println(hs);
	
}
}
