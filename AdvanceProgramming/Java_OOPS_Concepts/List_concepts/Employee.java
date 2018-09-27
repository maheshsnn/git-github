package List_concepts;

import java.util.Comparator;

public class Employee //implements Comparable<Employee>
{

	private String name;
	private int dob;

	public Employee(String name, int dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	/*@Override
	public int compareTo(Employee O) {
		// TODO Auto-generated method stub
		int compares = name.compareTo(O.name);
		if (compares == 0) {
			compares=Integer.compare(dob, O.dob);
		}
		return compares;
	}*/

	public String toString() {
		return "name: " + name + ";  dob:" + dob + "\n";

	}


}
