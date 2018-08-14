package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapEmploye {

	public static void main(String[] args) {

		HashMap<Integer, Employeeclass> hms = new HashMap<Integer, Employeeclass>();

		Employeeclass e1 = new Employeeclass("mahesh", 23, "QA");
		Employeeclass e2 = new Employeeclass("mahi", 24, "dev");

		hms.put(1, e1);
		hms.put(2, e2);

		System.out.println(hms.get(1));

		for (Entry m : hms.entrySet()) {
			System.out.println("Key info " + m.getKey());

			Employeeclass e = (Employeeclass) m.getValue();

			System.out.println(e.name + e.age + e.dept);

		}

	}

}
