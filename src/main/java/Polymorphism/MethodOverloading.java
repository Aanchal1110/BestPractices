package Polymorphism;

public class MethodOverloading {
    //Method overloading also known as compile time polymorphism or early binding
    //Different ways to implement
    //1. different number of parameters
    //2. different types of parameters
    //3. different types of sequence of parameters

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

//    public double add (int a, int b){
//        return a+b;
//    } --> polymorphism is done based on the arguments passed not on the basis of the return type
    // this is why it will throw an error

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        System.out.println(methodOverloading.add(5,3));
    }
}
