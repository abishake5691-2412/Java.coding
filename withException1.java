public class withException1{
    public static void main(String[] args) {
        System.out.println("Program Strated");
        try{
            int result=10/10;
            System.out.println("error");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finnay block executed");
        }
        System.out.println("Program ended");

    }
}
    