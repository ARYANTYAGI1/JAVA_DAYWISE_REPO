import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.print("Enter Digit:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int c=0;
        // int a=0;
        while(n!=0){
            n=n/10;
            c=c+1;
        }
        System.out.print("No. Of Digit:"+c);
        scanner.close();
    }
}
