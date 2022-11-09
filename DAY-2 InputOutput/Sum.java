
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter 1st No.:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter 2nd No.:");
        int b=sc.nextInt();
        sc.close();
        int c=a+b;
        System.out.print("Sum is: "+ c);
    }
}
