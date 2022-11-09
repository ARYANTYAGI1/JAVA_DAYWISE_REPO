package Patterns;

public class RhombusStarPattern4 {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
