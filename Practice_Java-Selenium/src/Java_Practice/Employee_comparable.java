package Java_Practice;

public class Employee_comparable implements Comparable<Employee_comparable> {
	

	private String name;
	private int dob;
	
	public Employee_comparable(String name,int dob)
	{
		this.name=name;
		this.dob=dob;
		
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setdob(int dob)
	{
		this.dob=dob;
	}
	
	public String getname()
	{
		return name;
		
	}
	
	public int getdob()
	{
		return dob;
		
	}
	
	

	@Override
	public int compareTo(Employee_comparable O) {
		// TODO Auto-generated method stub
		int compare=name.compareTo(O.name);
		if(compare==0)
		{
		compare=Integer.compare(dob, O.dob);
		}
		return compare;
	}
	
	
	public String toString()
	{
		return "name : " + name + ";  dob: "+ dob + "\n";
	}

}
