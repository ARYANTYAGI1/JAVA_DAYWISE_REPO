import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        System.out.println("Enter 1st Num:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd num:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd num:");
        int c=sc.nextInt();
        sc.close();
        if(a>b&&a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is greater");

        }
        else{
            System.out.println(c+" is greater");
        }
       
    }
}
