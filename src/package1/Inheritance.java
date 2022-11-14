package package1;

class add{  

    add(){

    }
    add(int a , int b){
        System.out.println(a+b);

    }

    void run(){
        System.out.println("this is add class");
    }
}

class sub extends add { 
    void run2(){
        System.out.println("this is sub class");
    }
}

class mul extends add  { 

}


public class Inheritance {

    public static void main(String[] args) {
        System.out.println("inheritance");

        mul s = new mul();
        s.run();

    }

}