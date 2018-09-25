package List_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Sorting_list_String {
	
	
	public static void main(String[] args) {
		
		int count=0;
	//	List<String>words=Arrays.asList("mahesh","aaaa","ssssss","ccccc");
		
		 String[] words = {"ace", "crew", "dog","boom", "eon"};  

	      List<String> wordList = Arrays.asList(words);  

	
	      for(int i=0;i<wordList.size();i++)
	      
	      {
	    	  
	    	  for(int j=i+1;j<wordList.size();j++)
	    	  {
	    		  if(wordList.get(i).compareTo(wordList.get(j))>0) {
	    		  String temp=wordList.get(i);
	    		  wordList.set(i, wordList.get(j));
	    		  wordList.set(j, temp);}
	    	  }
	    	  
	    	  System.out.println(wordList.get(i));
	      }
	
	}

}
