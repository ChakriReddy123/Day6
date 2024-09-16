package com.day6;
import java.util.*;
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student("Pavan",12));
		l.add(new Student("Chakri",11));
		l.add(new Student("Hemanth",9));
		l.add(new Student("Prathik",15));
		l.add(new Student("Parthik",16));
		
		Comparator<Student> c=(e1,e2)->{
			return e1.marks-e2.marks;
		};
		l.sort(c);
		System.out.println(l);
		

	}

}
