import java.util.Scanner;

public class jes {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int abi=sc.next().charAt(0);
    if(abi>=65 && abi<=90){
        System.out.println("upper case");
    }
    else if(abi>=97 && abi<=122){
        System.out.println("lower case");
    }
    else if(abi>=48 && abi<=57){
        System.out.println("digits");
    }
    else{
        System.out.println("special character");
    }
    }
    


    
}
