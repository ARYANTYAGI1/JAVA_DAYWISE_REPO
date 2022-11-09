import java.util.Scanner;

public class SumofDigit {
   public static void main(String[] args) {
    System.out.print("Enter Number:");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int sum=0;
    int product=1;
    while(n!=0){
        int a=n%10;
        sum=sum+a;
        product=product*a;
        n=n/10;

    }
    System.out.println("Sum is "+sum);
    System.out.println("Product is "+product);
    scanner.close();
   } 
}
