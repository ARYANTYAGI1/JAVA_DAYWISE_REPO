import java.util.Scanner;

public class Facto{
    public static void main(String[] args) {
    int fact=1;
    System.out.print("Enter No.:");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.print("Factorial is:"+fact);
    scanner.close();

    }
}
