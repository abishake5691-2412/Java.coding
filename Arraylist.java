    import java.util.*;

    public class Arraylist {
    public static void main(String[] args) {
        Arraylist<Integer> list=new Arraylist<>();
        list.add(e:10);
        list.add(e:20);
        list.add(e:30);
        list.set(1,15);
        list.remove(2);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        for(int i:list){
            System.out.print(i+" ");
        }
       
    }
    
}
