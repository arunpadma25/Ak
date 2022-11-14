package package1;


public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("method overloading");
        add(2,5.5);
    }

    static void add(int num1 ){
        System.out.println(num1 + num1);
    }

    static void add(int num1 ,double num2){
        System.out.println(num1 + num2);
    }

    static void add(int num1 ,int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }
}
