import java.util.Scanner;

public class BinToDec{
    public static void main(String[] args) {
        System.out.print("Enter Binary Number:");
        Scanner scanner=new Scanner(System.in);
        int bin=scanner.nextInt();
        int ans=0,i=0;
        while(bin!=0){
            ans=ans+(int)Math.pow(2, i)*(bin%10);
            bin=bin/10;
            i++;
        }
        System.out.print("Decimal Equivalent is:"+ans);
        scanner.close();
    }
}