package package1;

class Car{

    int speed;
    String color;

    Car(){
        speed = 100;
        color = "Black";
        System.out.println("default constructor is running");

    }

    Car(int i){
        speed = i;
        System.out.println("int i constructor is running");
    }

    Car(String i,int i1){

    }

    Car(int s ,String c){
        speed = s;
        color = c;
        System.out.println("int s,c constructor is running");

    }

    public void run(){
        System.out.println("car is running");
    }

}

public class Constructor {

        public static void main(String[] args) {
            System.out.println("hi guys");

            int number ;

            //Car audi = new Car();
            //audi.color = "Black";
            //class name


            Car bmw = new Car(200,"black");
            // bmw.speed = 200;
            // bmw.color = "White";

            //audi.run();
            System.out.println(bmw);

        }
    }