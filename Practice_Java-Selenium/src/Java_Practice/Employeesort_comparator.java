package Java_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employeesort_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee_Comparator> l = new ArrayList<Employee_Comparator>();

		l.add(new Employee_Comparator("Tom", 1981));
		l.add(new Employee_Comparator("Peter", 1978));
		l.add(new Employee_Comparator("John", 1924));
		l.add(new Employee_Comparator("John", 1923));
		l.add(new Employee_Comparator("Mary", 1956));
		l.add(new Employee_Comparator("Daisy", 1963));
		l.add(new Employee_Comparator("Peter", 1931));

		Comparator<Employee_Comparator> al = new Comparator<Employee_Comparator>() {

			@Override
			public int compare(Employee_Comparator O, Employee_Comparator O2) {
				// TODO Auto-generated method stub

				if (O.getname().compareTo(O2.getname()) > 0) {
					return 1;
				}
				else{
				return -1;
				}
				}

		};
		
		Collections.sort(l, al);
		System.out.println(l);

	}

}
