import java.util.Scanner;
public class SearchX {
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
        System.out.print("Enter X:");
        int x=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==x){
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
