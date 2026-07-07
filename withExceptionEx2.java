class LowMarkException extends exception{
    LowMarkException(String s){
        Super(s);

    }
}


public class withExceptionEx2 {
    public static void main(String[] args) throws LowMarkException
    {
        int mark=20;
        if(mark<40){
        throw new ArithmeticException("Marks are lesser fail");
        }
    }
}
    
