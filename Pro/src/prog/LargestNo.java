package prog;

public class LargestNo {

	public static void main(String[] args) 
	{
		int swap;
	int[] arr= {1233,1233,987,65,987,432,654,9999};
	
    for(int i=0;i<=arr.length-1;i++)
    {
    	for (int j=i+1;j<=arr.length-1;j++)
    	{
    	if(arr[i]<arr[j])
    	{   
    		swap=arr[i];
    		arr[i]=arr[j];
    		arr[j]=swap;
    	}}
    }
    System.out.println("The largest number in the array is "+arr[0]);
	
	}

}
