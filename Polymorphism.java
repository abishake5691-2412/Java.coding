class Calculator{
    //method overloading
    int add(int num1,int num2);
    return num1+num2;
}
int add(int num1,int num2,int num3){
    return  num1+num2+num3;
}
double add(double num1,double num2){
    return num1+num2;
}
q
//method overiding
class polymorphism{
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add(11,22);
        c.add(11,22,33);
        c.add(1.2,2.2);
    }
}