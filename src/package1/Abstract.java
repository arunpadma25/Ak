package package1;

abstract class Bike{
    void run(){

    }

    abstract void running();

}

class pulsar extends Bike{ 

    void running(){ 
        System.out.println("running");
    }

}


public class Abstract {

    public static void main(String[] args) {
        System.out.println("Abstract");
        Bike obj = new pulsar();
        obj.run();
        obj.running();

    }
}
