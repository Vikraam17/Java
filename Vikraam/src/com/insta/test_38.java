package com.insta;
import java.util.*;
//learnwithavc
public class test_38 {
	public static void main(String[] args)
	
	{
		List<String> list=Arrays.asList("Apple","Banana","Cherry","Date");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);	
	}
}
