package com.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList ();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

	//	1st way to get Stream instance
		Stream<Integer> s1=al.stream();
		s1.forEach(e->System.out.println(e));
	
//		2nd way to get Stream instance
	//	Stream s2=Stream.of(al);
//		s2.forEach(e->System.out.println(e));
		
	//	3rd way to get Stream instance
	//	Stream s3=Stream.of(100,200,300,400,500);
	//	s3.forEach(e->System.out.println(e));
		
	//  4th way to get Sream instance
	//	int[] arr= {600,700,800,900,1000};
	//	 IntStream s4= Arrays.stream(arr);
	//	 s4.forEach(e->System.out.println(e));
			
	//	5th way to get stream instance
	//	Stream s5=Stream.empty();
		
	//----------------------------------------------------------------//	
	//	al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));    // even no get
//		Stream<String> s=al.stream();
	//	s.map(e->e.toUpperCase).forEach(e->System.out.println(e));
		
		
		
	
	}

}
