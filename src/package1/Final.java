package package1;

class Cons{

  final void display(){
      int i  = 100;
      System.out.println("100");

  }

}

class ok extends Cons{

}

public class Final {
  public void dis(){
      System.out.println("Final");
      final int i = 10;
      ok obj = new ok();
      obj.display();
  }
}