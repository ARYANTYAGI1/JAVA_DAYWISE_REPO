import java.util.Scanner;

public class TableofN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("Enter No:");
        int n=scanner.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        scanner.close();
    }
}
