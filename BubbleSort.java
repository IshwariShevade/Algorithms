import java.util.Scanner;
import java.io.*;

class BubbleSort {

	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int num = reader.nextInt();
		int a[] = new int[num];
		reader.nextLine();
		System.out.println("Enter the elements");
		Scanner numScan = new Scanner(reader.nextLine());

		for(int i = 0; i <num; i++)
		{
			if(numScan.hasNextInt())
				a[i] = numScan.nextInt();
		}
		bubsort(a);
	}

	public static void bubsort(int a[])
	{
		int temp;
		for(int i = 0; i < a.length; i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("The sorted output is ");
		for(int i = 0; i < a.length; i++)
				System.out.println(a[i]);
	}
}