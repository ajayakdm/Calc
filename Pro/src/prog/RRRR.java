package prog;

public class RRRR 

{
	public static void main(String[] args) {
		
	
	String sentense = "This is a good day";  
	char[] arr = sentense.toCharArray();  
	int temp=0;
	  
	//Logic to iterate up to end of the line.  
	for (int fl = 0; fl <= arr.length - 1;fl++ )  
	{  
	    int count = temp;  
	    int num1 = 1;  
	    //To get the word before space or the last word  
	    if (arr[fl] == ' ' || fl == arr.length - 1)  
	    {  
	        if (fl == arr.length - 1)  
	        {  
	            for (int c = fl; c >= temp; c--)  
	            {  
	                //Swap the word  
	                if (num1 <= (fl - temp) / 2)  
	                {  
	                    char tempC = arr[count];  
	                    arr[count] = arr[c];  
	                    arr[c] = tempC;  
	                    count++;  
	                    num1++;  
	                }  
	            }  
	        }  
	        else  
	        {  
	            for (int c = fl - 1; c >= temp; c--)  
	            {  
	  
	                if (num1 <= (fl - temp) / 2)  
	                {  
	                    char tempC = arr[count];  
	                    arr[count] = arr[c];  
	                    arr[c] = tempC;  
	                    count++;  
	                    num1++;  
	                }  
	            }  
	        }  
	        temp = fl + 1;                  
	    }  
	  
	}  
	  
	String newLine = new String(arr);     
}
}