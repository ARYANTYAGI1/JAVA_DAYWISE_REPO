package Patterns;

import java.util.Scanner;

public class HollowRightTriangleP9 {
    public static void main(String[] args) {
        System.out.print("Enter No of Rows:");
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||i==n||j==i){
                    System.out.print("*");;
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        scanner.close();

    }
}
