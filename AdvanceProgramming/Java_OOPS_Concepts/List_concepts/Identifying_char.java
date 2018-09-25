package List_concepts;

import java.util.ArrayList;

public class Identifying_char {
	
	
	public static void main(String[] args) {
		
	//one way

	ArrayList<String> wordList = new ArrayList(); 
	   
     wordList.add("dddd");
     wordList.add("cccc");
     wordList.add("aaaaaa");
     wordList.add("bbbbbbb");
     
     //sorting an array
   	 
     for(int i=0;i<wordList.size();i++)
     {
   	  for(int j=i+1;j<wordList.size();j++)
   	  {
   		  if(wordList.get(i).compareTo(wordList.get(j))>0) {
   		  String temp=wordList.get(i);
   		  wordList.set(i, wordList.get(j));
   		  wordList.set(j, temp);
   		  
   		  }
   		  
   		  
   		  
   	  }
   	   System.out.println(wordList.get(i));
   	   
	}
   
     
     //identifying one element 
     for(int i=0;i<wordList.size();i++)
     {
    	 System.out.println("**************************************");
    	 
    	 String s=wordList.get(i);
     	 char[] ch=s.toCharArray();
    	 if(ch[0]=='b')
    	 {
    		 System.out.println(s);
    	 }
    	 System.out.println("**************************************");
 
     }
     

}
}