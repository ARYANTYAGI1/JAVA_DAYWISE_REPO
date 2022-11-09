import java.util.Scanner;

public class HCFLCM{
  public static void main(String[] args) {
    System.out.print("Enter Num1:");
    Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    System.out.print("Enter Num2:");
    int num2=scanner.nextInt();
    while(num1%num2!=0){
      int a=num1%num2;
      num1=num2;
      num2=a;
    }
    scanner.close();
    System.out.print("HCF is:"+num2);
  }
}