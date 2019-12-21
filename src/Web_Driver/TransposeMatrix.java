package Web_Driver;

import java.util.Scanner;


public class TransposeMatrix {
	public static void main(String[] args) 
	{
	//use Scanner to accept data from keyboard
	Scanner sc =new Scanner(System.in);
	//accept rows, columns of a matrix
	System.out.println("Enter rows&columns");
	int r = sc.nextInt();
	int C= sc.nextInt();
	//create an array with size [r[c]
	int arr[][] = new int[r][C];

	//accept a matrix from keyboard
	System.out.println("Enter elements of matrix: ");
	for(int i=0 ; i<r;i++)
	for(int j= 0; j<C;j++)
	arr [i][j] =sc.nextInt();
	System.out.println("The transpose matrix" );
	//take columns as rows and vice versa and display
	for(int i=0 ; i<C;i++)
	{
	for(int j=0 ; j<r;j++)
	{
	System.out.println(arr[i][j]+"");
	}
	System.out.println("\n");
	}
	}
	}


