public class Loop1 {
     public static void main(String[] args){
        for(int j = 10; j <=20 ; j++ ){
            System.out.println(j);
            if (j == 16){
                System.out.println(j);
                continue;
            }
        }
    }
}
    
