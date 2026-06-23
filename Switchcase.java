import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.err.println("Sunday");
                break;
            case 2:
                System.err.println("Monday");
                break;
            case 3:
                System.err.println("Tuesday");
                break;
            case 4:
                System.err.println("Wednesday");
                break;
            case 5:
                System.err.println("Thursday");
                break;
            case 6:
                System.err.println("friday");
                break;
            case 7:
                System.err.println("Saturday");
                break;
            default:
                System.err.println("Default case");
                break;
        }
        
    }
    
}