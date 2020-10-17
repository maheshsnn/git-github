package Java_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Employee_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee_comparable> l=new ArrayList<Employee_comparable>();
		
		l.add(new Employee_comparable("Tom",1981));
		l.add(new Employee_comparable("Peter",1978));
		l.add(new Employee_comparable("John",1924));
		l.add(new Employee_comparable("John",1923));
		l.add(new Employee_comparable("Mary",1956));
		l.add(new Employee_comparable("Daisy",1963));
		l.add(new Employee_comparable("Peter",1931));
	
	
Collections.sort(l);
System.out.println(l); 

	}

}
