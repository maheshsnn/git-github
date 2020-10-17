package Java_Practice;

public class Employee_Comparator  {
	

	private String name;
	private int dob;
	
	public Employee_Comparator(String name,int dob)
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
	
	
/*
	@Override
	public int compareTo(Employee_Comparator O) {
		// TODO Auto-generated method stub
		int compares=name.compareTo(O.name);
		if(compares==0)
		{
		compares=Integer.compare(dob, O.dob);
		}
		return compares;
	}*/
	
	
	public String toString()
	{
		return "name : " + name + ";  dob: "+ dob + "\n";
	}

}
