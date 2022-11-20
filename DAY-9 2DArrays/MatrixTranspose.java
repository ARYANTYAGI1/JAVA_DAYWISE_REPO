import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print("Enter Col:");
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter Elements in  Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int arr2[][]=new int[n][m];
        System.out.println("Transpose of Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=arr[j][i];
            }
        
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
