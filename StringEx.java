class StringEx{
    public static void main(String[] args){
        String s="Hello world java programming";
        for(char c:s.toCharArray()){
            System.out.print(c+" ");
        }
        String[] arr=s.split(regex:" ");
        System.out.print(arr[2]);
        String s="Hello World";
        String a=new String(original:"Hello world");
        System.out.println(s.equal(a));
        System.out.printl(s.charAt(7));
        System.out.print(s.length());
    }
}