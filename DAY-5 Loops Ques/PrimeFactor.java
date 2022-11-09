public class PrimeFactor {
    public static void main(String[] args) {
        
    
    int num=10;
    for(int i=1;i<=num;i++){
        int c=0;
        if(num%i==0){
            for(int j=1;j<=i;j++){
    
                if(i%j==0){
                    c=c+1;
                }
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}
}
