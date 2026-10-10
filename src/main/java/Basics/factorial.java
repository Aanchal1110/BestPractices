package Basics;

public class factorial {
    public static int printFactorialUsingRecursion(int n){
        if(n-1>0){
            return n*printFactorialUsingRecursion(n-1);
        }
        return 1;
    }

    public static int printFactorialUsingWhileLoop(int n){

        int result=1;
        while (n>0){
            result=result*n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        int result= printFactorialUsingRecursion(4);
        System.out.println(result);

        int resultWhile=printFactorialUsingWhileLoop(5);
        System.out.println(resultWhile);
    }
}
