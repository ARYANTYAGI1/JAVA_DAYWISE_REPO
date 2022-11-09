public class FactorialP2 {
    public static int solution(int n)
    {
        if(n==0||n==1){
            return 1;
        }
        int f=n*solution(n-1);
        return f;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=solution(n);
        System.out.println(ans);
    }
}
