import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String args[])
    {
        int a[][],b[][],c[][], i, j, k;
        a = new int [3][3];
        b = new int [3][3];
        c = new int [3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first matrix");
        for(i=0; i<2; i++)
            for(j=0;j<2;j++)
                a[i][j] = input.nextInt();

        System.out.println("Enter second matrix");
        for(i=0; i<2; i++)
            for(j=0;j<2;j++)
                b[i][j] = input.nextInt();

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=0;
                for(k=0;k<2;k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication Resul...");
        for(i=0; i<2; i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }
}