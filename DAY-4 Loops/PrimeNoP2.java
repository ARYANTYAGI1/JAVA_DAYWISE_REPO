public class PrimeNoP2 {
    public static void main(String[] args) {
    int n=25;
    boolean prime=true;
    if(n%2==0||n%3==0){
        prime=false;
    }
    if(prime){
        for(int i=5;i*i<n;i+=6){
            if(n%i==0||n%i+2==0){
                prime=false;
                break;
            }
        }
    }
    if(prime){
        System.out.println("Number is Prime");
    }
    else{
        System.out.println("Number is not prime");
    }
    }
}
