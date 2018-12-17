package List_concepts;

import java.util.ArrayList;

public class Sorting_Int {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(4);

		int ttal = al.size();

		for (int i = 0;i<al.size(); i++) {
			
			for (int j = i+1;j<al.size(); j++) {

				if (al.get(i) > al.get(j)) {
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);

				}
			
				if(al.get(i).equals(al.get(j)))
				{
					System.out.println("w");
					al.remove(j);
					j--;
				}
				
				

			}

		}
		System.out.println(al); 
		

	}
}
