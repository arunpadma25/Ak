package package1;

class Newclass {
    void useMe(){
        System.out.println("im use me method");
    }

    int sub(int a , int b){
        return a-b;
    }
}


public class Topic1 {
    public static void main(String[] args) {


        System.out.println("hi guys");
            methodOne(); 
            System.out.println(methodTwo(20,3,5));  
            System.out.println(methodThree(2.5));

            Newclass object = new Newclass();
            object.useMe();
            int c = object.sub(10,5);
            System.out.println(c);

            int number = 10;
            String name = new String("karthik");
            // name.length();


        }

        private static void methodOne() {

            System.out.println("method 1");
        }

        static int methodTwo(int num1 , int num2 , int num3){ 
            return num1 - num2 * num3;
        }

        static double methodThree(double num1){

            return num1 * num1 ;
        }


    }