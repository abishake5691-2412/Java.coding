public class PalindromeString {
    public static void main(String[] args){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
        }
    class palindromeString{
        public static void main(String[] args){\
            Scanner in=new Scanner(System.in);
            String s=in.next();
            if(ispalidrome(s)){
                System.out.println("palidrome");
            }
            else{
                System.out.println("Not palidrome");
            }


    }
   
    }
    
}
