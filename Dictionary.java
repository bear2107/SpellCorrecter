import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Dictionary {
	
	String x;
	
	
	
	//	Dictionary a=new Dictionary();
	//	File starting = new File(System.getProperty("/home/bear/workspace/Spellchecer/Files"));
		
	HashMap<String,Integer> createdic(String file) throws IOException
	{
		HashMap<String,Integer> dict=new HashMap<String,Integer>();
		//File starting = new File(System.getProperty("/home/bear/workspace/Spellchecer/Files"));
		BufferedReader fileReader=new BufferedReader(new FileReader(file));
		Pattern p = Pattern.compile("\\w+");
		System.out.println("Reading Dictionary.. Please wait\n");
		while(fileReader.ready())
		{
			for(String temp = ""; temp != null; temp = fileReader.readLine()){
				Matcher m = p.matcher(temp.toLowerCase());
				while(m.find()) 
					dict.put((temp = m.group()), dict.containsKey(temp) ? dict.get(temp) + 1 : 1);
			}
			//result[i].replace("?","");
			
			//for(int i=0;i<result.length;i++)
			//{
				//System.out.println(result[i]);
		//	if(result[i].length()>1)
			//{
		//	x=checkword(result[i]);
			//if(dict.containsValue(x)==false)
				//dict.put(result[i], result[i]);
			}	
				
		
		
		
		return dict;
		
	}
	
	

}
