package List_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting_list_String {
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		int count=0;
	//	List<String>words=Arrays.asList("mahesh","aaaa","ssssss","ccccc");
		
		 String[] words = {"ace", "crew", "dog","boom", "eon","ace"};  

	      List<String> wordList = Arrays.asList(words);  

     	      //this is one way
	      
	      for(int i=0;i<wordList.size()-1;i++)
	      
	      {
	    	  
	    	  for(int j=i+1;j<wordList.size()-1;j++)
	    	  {
	    		  if(wordList.get(i).compareTo(wordList.get(j))>0) {
	    		  String temp=wordList.get(i);
	    		  wordList.set(i, wordList.get(j));  //sorting strings 
	    		  wordList.set(j, temp);
	    		  
	    		  
	    		  if(wordList.get(i).compareTo(wordList.get(j))==0)
		    		{
	    			 
		    			wordList.remove(wordList.get(j)); // remove duplicates
		    		
		    		}
	    		  
	    		  }
	    	  }
	    	 
	    	  System.out.println(wordList.get(i));
	    	 
	      }
	      
	      
	      //another way is to instatntiate comparator interface
	      
	   //remove duplicates
	  /*    for(int i=0;i<wordList.size()-1;i++)
		      
	      {
	    	  
	    	  for(int j=i+1;j<wordList.size()-1;j++)
	    	  {
	    		  
	    		if(wordList.get(i).compareTo(wordList.get(j))==0)
	    		{
	    			wordList.remove(wordList.get(j));
	    			
	    		}
	    		  
	    	  }
	    	    System.out.println(wordList.get(i));   
	      
	      }*/
	
	      
	}

}
