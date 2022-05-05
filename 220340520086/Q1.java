import java.util.Scanner;
class Q1
{
	
	public static void sortedInsertion(int a1[])
	{
		int length = a1.length;
		int insertion = a1[length-1];
		
		for(int i = length -2;i>=0; i--)
		{
			if(a1[i]> insertion)
			{
				a1[i+1]=a1[i];
				printArray(a1);
			}
			else
			{
			a1[i+1] = insertion;
			printArray(a1);
			}
			}
		}
		
	
	
	private static void printArray(int[] a1)
	{
		for (int n:a1)
		{
			System.out.print(n+" ");
		}
		System.out.println("");
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int s = new int [s];
		for(int i = 0; i<s; i++)
		{
			a1[i] = sc.nextInt();
		}
		sortedInsertion(a1);
		sc.close();
	}
}