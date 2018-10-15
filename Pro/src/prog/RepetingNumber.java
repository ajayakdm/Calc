package prog;

import java.util.Arrays;

public class RepetingNumber {

	public static void main(String[] args)
	{
		/*int[] numbers = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
		{
		System.out.print(numbers[i] +" ");
		}
		System.out.println();
		for(int i = 1; i < numbers.length; i++) {
		    if(numbers[i] == numbers[i - 1]) {
		        System.out.println("Duplicate: " + numbers[i]);
		    }}}}*/
		
		int[] arr= {1,2,3,4,5,6,7,8,9,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i] +" ");
		}
		System.out.println();
		int count=0;
	    int	n=0;
	for (int i=0; i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				
				count++;	
			}
			
	    else{
				System.out.println(arr[i] +" is repeated " +count +" times");
				count=0;
			    i=j;
			}
			n=j;		
		}	
	}
	System.out.println(arr[n]+" is repeated "+count +" times");
	}}


