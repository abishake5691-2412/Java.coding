public class ReverseString {
    public static void main(String[] args){
        String s="Reverse";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();//reverse the string
        String reversedString=sb.reverse().toString();//convert StringBuilder into String
        System.out.println(reversedString);
    }
    
}
