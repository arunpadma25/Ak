package package1;

class a1{
    void display(){
        System.out.println(" al class");    }

}

class b1 extends a1{
    @Override
    void display(){
        System.out.println(" bl class");    }
 

}

public class Methodoverride {
    public static void main(String[] args) {
        System.out.println("method overriding");
        b1 obj = new b1();
        obj.display();

    }
}