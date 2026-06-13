package dev.kaldiroglu.fpj.ch02.lambda;

import java.util.Comparator;

public class LambdaTargets {

	public static void main(String[] args) {

		Comparator<String> c1 = (String s1, String s2) -> s1.compareToIgnoreCase(s2);

//		var c2 = (String s1, String s2) -> s1.compareToIgnoreCase(s2);  // Problem! Can not infer type
		
		compareStrings(c1, "Java", new String("java"));
		
		
		compareStrings((String s1, String s2) -> s1.compareToIgnoreCase(s2), "Java", new String("java"));
		
		Runnable r = toDoLater();
	}
	
	public static void compareStrings(Comparator<String> comparator,  String s1, String s2) {
		System.out.println(comparator.compare(s1, s2));
	}

	public static Runnable toDoLater() {
		
		return () -> {
			System.out.println("later");
		};
	}
}
