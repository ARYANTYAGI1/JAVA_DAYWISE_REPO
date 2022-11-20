
import java.util.Scanner;



public class TakingValue{
    public static void main(String[] args) {
        System.out.print("Enter Rows:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print("Enter Columns:");
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter Elements in 2D Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Elements in ArraY:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
