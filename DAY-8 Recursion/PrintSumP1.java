public class PrintSumP1 {
    public static void  solution(int i,int n,int sum){
        if(i==n+1){
        System.out.println(sum);
            return ;
        }

        sum=sum+i;
        solution(i+1, n, sum);
       
    }
    public static void main(String[] args) {
        int n=5;
        solution(1,n,0);

    }
}
