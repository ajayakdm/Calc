package prog;

public class SortingAssending {

	public static void main(String[] args)
	{
	int arr[]= {3,7,1,2,6,8,4,5};
	int swap;
	for(int i=0;i<=arr.length-1;i++)
    {
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]>arr[j])
		{
			swap=arr[i];
			arr[i]=arr[j];
			arr[j]=swap;
			
		}
	    }
		
		}
	for(int i=0;i<arr.length;i++)
	{
	System.out.print(arr[i] +" ");
	}
	

	}

}
