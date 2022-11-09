import java.util.Scanner;

public class HCFLCM2{
    public static void main(String[] args) {
    System.out.print("Enter Num1:");
    Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    System.out.print("Enter Num2:");
    int num2=scanner.nextInt();
    int n=num1;
    int m=num2;
    int lcm=0;
    while(num1-num2!=0){
        if(num1>num2){
            num1=num1-num2;
        }
        else{
            num2=num2-num1;
        }
        // LCM
    lcm=(n*m)/num1; 
        scanner.close();
    }
    System.out.println("HCF is:"+num1);
    System.out.println("LCM is:"+lcm);
    }
}