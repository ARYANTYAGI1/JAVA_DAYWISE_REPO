import java.util.Scanner;

public class IfElseP3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int a=scanner.nextInt();
        System.out.println("Enter 2nd Value");
        int b=scanner.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
           System.out.println("b is greater");
     }
        scanner.close();
    }
}
