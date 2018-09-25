package List_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting_array_anotherway {
	
	public static void main(String[] args) {
		
	//one way

	ArrayList<String> wordList = new ArrayList(); 
	   
     wordList.add("dddd");
     wordList.add("cccc");
     wordList.add("aaaaaa");
     wordList.add("bbbbbbb");
     
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
     

     
     //another way
     
     String[] ss=wordList.toArray(new String[wordList.size()]);
    
     
      for(int i=0;i<ss.length;i++)
     {
   	  for(int j=i+1;j<ss.length;j++)
   	  {
   		if(ss[i].compareTo(ss[j])>0)
   		{
   			String temp=ss[i];
   			ss[i]=ss[j];
   			ss[j]=temp;
   		}
   	  }
   	  System.out.println(ss[i]);
     }
     
     
     
     
     

}

	
	

}
