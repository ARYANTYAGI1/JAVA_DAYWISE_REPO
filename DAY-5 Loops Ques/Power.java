import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.print("Enter Num:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.print("Enter Exp:");
        int exp=scanner.nextInt();
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*num;
        }
        System.out.print("Power is: "+pow);
        scanner.close();
    }
}
