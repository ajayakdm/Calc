package otherProgram;

public class DuplicateNo {

	public static void main(String[] args) 
	{
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java","Python" };
	 
		System.out.println("Finding duplicate elements in array using brute force method"); 
		for (int i = 0; i < names.length; i++) 
		{ 
			for (int j = i + 1; j < names.length; j++) 
			{ 
				if (names[i].equals(names[j]) ) 
				{
					System.out.println(names[i]); 
					
				}
				}
			}
		}

		

	}


