import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args) {
        System.out.print("Enter First Name:");
        Scanner scanner=new Scanner(System.in);
        String fname=scanner.nextLine();
        System.out.print("Enter Last Name:");
        String lname=scanner.nextLine();
        System.out.println(fname);
        System.out.println(lname);
        // 1. Concat
        String fullname=fname+" "+lname;
        System.out.println(fullname);
        // 2. Length Function
        System.out.println(fullname.length());

        // 3. CharAt Method
        for( int i=0;i<fullname.length();i++){
            System.out.println(fname.charAt(i));
        }
        // 4. Compare Method
        if(fname.compareTo(lname)==0){
            System.out.println("Equal");

        }else{
            System.out.println("Not Equal");
        }

        }
        





}  

