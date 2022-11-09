import java.util.Scanner;

public class ReverseIntger {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print("Reverse is: "+rev);
        scanner.close();
    }
}
