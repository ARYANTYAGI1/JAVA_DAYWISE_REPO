import java.util.Scanner;

public class Product {
    public static int Multiply(int a, int b){
        int result=a*b;
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter num1:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.print("Enter num2:");
        int b=scanner.nextInt();
        int ans=Multiply(a, b);
        System.out.print("Ans is:"+ans);
        scanner.close();
    }
}
