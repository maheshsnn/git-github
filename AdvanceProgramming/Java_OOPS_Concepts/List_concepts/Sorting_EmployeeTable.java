package List_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_EmployeeTable {
	

	public static void main(String[] args) {
		
	
	
	List<Employee>l=new ArrayList<Employee>();
	
	l.add(new Employee("Tom",1981));
	l.add(new Employee("Peter",1978));
	l.add(new Employee("John",1924));
	l.add(new Employee("Mary",1956));
	l.add(new Employee("Daisy",1963));
	l.add(new Employee("Peter",1931));
	
	Collections.sort(l);
	System.out.println(l);
	
	}
}
