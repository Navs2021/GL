import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args)
	{
	    int m, n, i, j,x,y;
	Scanner in = new Scanner(System.in);

	System.out.println(" Enter number of rows and columns of First matrix ");
	m = in.nextInt();
	n = in.nextInt();
	System.out.println(" Enter number of rows and columns of Second matrix ");
	x = in.nextInt();
	y = in.nextInt();

	int m1[][] = new int[m][n];
	int m2[][] = new int[x][y];
	int sum[][] = new int[m][n];

	if(m==x && n==y) {
	
	System.out.println(" Enter the elements of first matrix ");

	for (i = 0; i < m; i++)
	for (j = 0; j < n; j++)
	m1[i][j] = in.nextInt();

	System.out.println(" Enter the elements of second matrix ");

	for (i = 0 ; i < x ; i++)
	for (j = 0 ; j < y ; j++)
	m2[i][j] = in.nextInt();

	for (i = 0; i < m; i++)
	for (j = 0; j < n; j++)
	sum[i][j] = m1[i][j] + m2[i][j];

	System.out.println(" Sum of the matrices: ");
	
	for (i = 0; i < m; i++)
	{
	for (j = 0; j < n; j++)
		System.out.println(sum[i] [j]);

	System.out.println();
	}
	}
	else
		System.out.println(" Both the Matrix are not of same size ");
	}
}