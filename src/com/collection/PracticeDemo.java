package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//Given a list of customer emails (with duplicates),
//clean it using a HashSet so only unique emails remain.
//
//[
// "alice@gmail.com",
// "bob@yahoo.com",
// "alice@gmail.com",
// "david@outlook.com",
// "bob@yahoo.com",
// "charlie@gmail.com"
//]
public class PracticeDemo {
public static void main(String[] args) {
	List email=Arrays.asList(
			"alice@gmail.com",
			 "bob@yahoo.com",
			 "alice@gmail.com",
			 "david@outlook.com",
			 "bob@yahoo.com",
			 "charlie@gmail.com"
	);
	
	HashSet h1=new HashSet<>(email);
	
	System.out.println("original email :"+email);
	System.out.println("unique email :"+h1);
}
}
