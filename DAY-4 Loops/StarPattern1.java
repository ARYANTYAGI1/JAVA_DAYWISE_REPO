import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            for( int j=1;j<=i;j++){

            
            System.out.print("*");
            }
            System.out.println('\n');
        }
        scanner.close();
    }
}
