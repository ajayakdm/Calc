package otherProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Duplicate {

	public static void main(String[] args) 
	{
	ArrayList l=new ArrayList();
	LinkedHashSet s=new LinkedHashSet();
	String str="hello hi";
    char[] str2 = str.toCharArray();	
	for (int i=0;i<str.length();i++) 
	{		
		if(str2[i]!=' ')
		{
		l.add(str.charAt(i));
		s.add(str.charAt(i));
		}
	}
	Object[] ss = s.toArray();
	Object[] ll = l.toArray();
	for(int j=0;j<ss.length;j++) 
	{
		int count=0;
		for(int k=0;k<ll.length;k++)
		{
		 if(ss[j].equals(ll[k]))
			{
			 count++;				
			}
		}
		 
		if(count>1)
		{
		 System.out.println(ss[j] +" repeated " +count +" times");
	}}
	System.out.println(l);
	System.out.println(s);
}
	}
