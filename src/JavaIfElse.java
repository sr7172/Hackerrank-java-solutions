import java.util.Scanner;

/*Java program to test your if-else knowledge.
*Given an integer n, perform the following conditional actions:
*If n is odd, print Weird
*If n is even and in the inclusive range of 2 to 5, print Not Weird
*If n is even and in the inclusive range of 6 to 20 , print Weird
*If , is even and greater than 20, print Not Weird
 */
public class JavaIfElse
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n % 2 == 1){
            System.out.println("Weird");
        }
        else{
            if(n >= 6 && n<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
    }
}
