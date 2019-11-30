package comparators;

import java.util.Comparator;
import java.util.TreeSet;

public class comparatorss {
	
	
	public static void main(String[] args) {
		
		
		TreeSet ts=new TreeSet(new mycomparator());
		ts.add(1);
		ts.add(3);
		ts.add(2);
		System.out.println(ts);
	}

}

class mycomparator implements Comparator
{
	


@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	
	

	
	Integer I1=(Integer)o1;
	Integer I2=(Integer)o2;
	return -I1.compareTo(I2);
}

}
