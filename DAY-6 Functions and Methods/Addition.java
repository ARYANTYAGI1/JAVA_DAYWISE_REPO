import java.util.Scanner;

public class Addition {
    public static int Sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
    System.out.print("Enter the Num1:");
    Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        System.out.print("Enter the Num2:");
        int num2=scanner.nextInt();
        int ans=Sum(num1, num2);
        System.out.print("Sum is:"+ans);
        scanner.close();
    }
}
