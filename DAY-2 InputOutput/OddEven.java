import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        if((num&1)==1){
     System.out.println("Odd");
        } 
        else {
            System.out.println("Even");;
        }
    }
}
