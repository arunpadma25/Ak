package package1;

class a{ 
    a(){
        System.out.println("a");
    }

    a(int i,int j){
        System.out.println("i , a");
    }
}

class b extends a {

    b(){
        System.out.println("b");
    }

    b(int i){
        super(i,i);
        System.out.println(" i b");
    }

}

public class Super {
    public static void main(String[] args) {
        System.out.println("super keyword");
        b obj = new b(10);

    }
}