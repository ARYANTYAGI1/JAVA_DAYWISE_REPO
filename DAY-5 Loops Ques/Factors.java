import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        scanner.close();
    }
}
