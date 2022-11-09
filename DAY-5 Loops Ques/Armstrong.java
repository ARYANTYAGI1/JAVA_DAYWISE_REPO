public class Armstrong{
    public static void main(String[] args) {
        int n=153;
        int m=n;
        int ans=0;
        while(n!=0){
            int a=n%10;
            ans= a*a*a+ans;
            n=n/10;
        }
        if(ans==m){
            System.out.print(m+" is Armstrong");
        }
        else{
            System.out.print(m+" is not Armstrong");
        }
    }
}