import java.util.Scanner;
 /*
 Java program to print out the multiplication table for a given input n.
  */
public class JavaLoopsI
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 0; i <= 10; i++){
            System.out.format("%d * %d = %d\n", n, i, i*n);
        }
    }
}
