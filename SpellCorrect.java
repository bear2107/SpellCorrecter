import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class SpellCorrect
{

	public static void main(String args[])throws IOException
	{
		SpellCheck d=new SpellCheck();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word\n");
		String s=br.readLine();
		
		HashMap<String, Integer> y=d.checkword(s);
		if(y.containsKey(s))
			System.out.println(s);
		else
		{
			SpellCorrect ob=new SpellCorrect();
			HashMap<Integer, String> suggest=new HashMap<Integer,String>();
		ArrayList<String> sem	=ob.correctword(s,y);
		for(String q:sem)
		{
			if(y.containsKey(q))
				suggest.put(y.get(q),q);
		}
		
		if(suggest.size()>0)
		{
			System.out.println("Word Incorrect");
			System.out.println("The possible suggestions are:");
			System.out.println(suggest.get(Collections.max(suggest.keySet())));
		}
		
	
			
		}
		
		
	}
	
	
	
	
	private  ArrayList<String> correctword(String word,HashMap<String, Integer> dict)
	{

	String w="";
		// TODO Auto-generated method stub
		ArrayList<String> suggest=new ArrayList<String>();
		for (int i = 0; i < word.length(); i++) 
		{
			   w = word.substring(0, i) + word.substring(i + 1);
			   //delete
			  
				   suggest.add(w);
				   
		}
		//swapping adjacent elements
		for (int i = 0; i < word.length() - 1; i++) { 
			   w = word.substring(0, i) + word.charAt(i + 1) + word.charAt(i) + word.substring(i + 2); 
			
			   suggest.add(w);
			  }
			   //replace a character
		 for (int i = 0; i < word.length(); i++) {
			   for (char c = 'a'; c <= 'z'; c++) {
			    w = word.substring(0, i) + c + word.substring(i + 1); 
			   
					   suggest.add(w);
			   }
			  }
			   //insert a character
		 for (int i = 0; i <= word.length(); i++) { 
			   for (char c = 'a'; c <= 'z'; c++) {
			    w = word.substring(0, i) + c + word.substring(i);
			    
					   suggest.add(w);
			   }
			  }
			return suggest;   
		
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
