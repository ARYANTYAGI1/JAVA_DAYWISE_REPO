package Patterns;

public class HollowSquareDiagonalPattern3 {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m||j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
