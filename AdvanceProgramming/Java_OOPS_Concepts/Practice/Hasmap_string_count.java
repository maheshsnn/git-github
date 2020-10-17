package Practice;

import java.util.HashMap;
import java.util.Map;

public class Hasmap_string_count {

	public static void main(String[] args) {

		String s = "This is autoation porg";
		int count = 0;

		String[] ms = s.split(" ");

		HashMap<String, Integer> mm = new HashMap<String, Integer>();

		/*
		 * for(int i=0;i<ms.length;i++) {
		 * 
		 * if(mm.containsKey(ms[i])) {
		 * 
		 * count=mm.get(ms[i]);
		 * 
		 * mm.put(ms[i], count+1);
		 * 
		 * }
		 * 
		 */

		for (String word : ms) {
			if (mm.containsKey(word)) {

				count = mm.get(word);
			System.out.println(mm.put(word, count + 1));

			}
			
		}
		/*for (Map.Entry<String, Integer> entry : mm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		*/

	}

}
