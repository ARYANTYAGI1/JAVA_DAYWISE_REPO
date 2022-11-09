import java.util.Scanner;

public class Multipy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number");
        int m=scanner.nextInt();
        System.out.println("Enter 2nd Number");
        int n=scanner.nextInt();
        scanner.close();
        int c=m*n;
        System.out.println("Result is:"+ c);

    }
}
