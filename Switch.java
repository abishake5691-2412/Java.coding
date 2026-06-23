import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char S=sc.next().charAt(0);
        switch (S) {
             case '+':
                System.err.println(a+b);
                break;
            case '*':
                System.err.println(a*b);
                break;
            case '-':
                System.err.println(a-b);
                break;
            default:
                System.err.println("Invalid Input");
                break;

        }

    }
    
}
