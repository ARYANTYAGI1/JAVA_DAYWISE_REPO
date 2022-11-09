public class NumberPatternP3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i-1;k++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
