abstract class Animal{//abstract class contais both abstract and normal method
    abstract void sound();//abstract method 
    void sleep(){//concrete method
        System.out.println("sleeping");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class AbstractionEx {
    public static void main(String[] args){
        Dog a=new Dog();
        a.sound();

    
    }
    
}
