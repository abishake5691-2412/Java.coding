class Student{
    //properties
    String name;//instance variable
    int rollNo;//instance variable
    //constructor
    Student(){
        name="default name";
        rollNo=1;
    }
    //parameterized constructor
    Student(String name,int rollNo){//local variable(n,roll)
        this.name=name;//name=Abi;
        this.rollNo=rollNo;//rollNo=1;(this is use for represent the instance variable)

    }
    //behaviour
    void sleep(){//this is new method
        System.out.println("sleeping");
    }
}
public class classEx {
    public static void main(String[] args){
        Student Student1=new Student("Abishake",1);
        Student Student2=new Student();
        //Student1.name="Abishake";
        Student1.rollNo=1;
        Student1.sleep();
        System.out.println(Student1.name);
        System.out.println(Student1.rollNo);
    }


    
}

