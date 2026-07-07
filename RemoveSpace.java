public class RemoveSpace {
    public static void main(String[] args){
        String s="Hello from java programming";
        int Wordcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==32){
                Wordcount++;
            }
        }
        System.out.println(Wordcount+1);
        }


    }
    
