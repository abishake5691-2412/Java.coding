public class WrapperClass {
    public static void main(String[] args) {
        String s="456";
        int x=Integer.parseInt(s);//convet String to int
        System.out.println(x);
        int n=100;
        Integer i=Integer.valueOf(n);//boxing-primitive to  obj
        i=200;//AutoBoxing
        int a=i.intValue();//Unboxing-obj to primitive
        int b=i;//autoBoxing

    }
    
}
