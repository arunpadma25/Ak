package package1;

class Thiss{

    int number1;

    Thiss(int number1) {
        this.number1 = number1;
    }

}
 class tt {

    public static void main(String[] args) {
        System.out.println("this keyword");
        Thiss object = new Thiss(100);
        System.out.println(object.number1);
    }

}