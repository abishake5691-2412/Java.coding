class Animal{
    Animal(){//constructor
        System.out.println("from animal constructor");

    }
    String color="Black";
    String name;//parent class
    void eating(){
        System.out.println("Eating");
    }

}
class cat extends Animal{//child class
    String color="Brown";
    void diaplaycolor(){
        System.out.println(color);
        System.out.println(super.color);

    }
    cat(){//parametrized constructor
        System.out.println("cat constructor");
    }

}
public class InheritanceEx {
    public static void main(String[] args){
        Cat c=new cat();
        c.displaycolor();
        c.eating();
    }

    
}
