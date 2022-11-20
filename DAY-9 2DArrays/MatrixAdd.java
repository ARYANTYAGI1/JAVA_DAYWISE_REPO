import java.util.Scanner;;
public class MatrixAdd {
 public static void main(String[] args) {
        System.out.print("Enter Rows:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print("Enter Columns:");
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter Elements in 1st Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.print("Enter Rows:");
       
        int k=scanner.nextInt();
        System.out.print("Enter Columns:");
        int l=scanner.nextInt();
        int arr2[][]=new int[k][l];
        System.out.println("Enter Elements in 1st Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=scanner.nextInt();
            }
        }
        int arr3[][]=new int[10][10];
        System.out.print("Addition:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
       scanner.close();
 }   
}
