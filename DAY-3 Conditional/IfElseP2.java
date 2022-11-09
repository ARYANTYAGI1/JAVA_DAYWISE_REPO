import java.util.Scanner;

public class IfElseP2 {
    public static void main(String[] args) {
        System.out.print("Enter Value:");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        if((num%2)==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
        scanner.close();
    }
}
