package prog;

public class StringAscOrder {

	public static void main(String[] args) {
		System.out.println("Name usn pswd");
	    String[] names= {"aj","vj","sj"};
		String [][] x={{"abc","abc123"},{"def","def456"},{"hij","hij789"}};
		for(int i=0;i<x.length;i++)
		{System.out.print(names[i] +"   ");
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] +" ");
				
			}
			System.out.println();
		}
		}
	
	}


