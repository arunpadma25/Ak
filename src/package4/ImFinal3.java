package package4;

public class ImFinal3 {
	
	//final class FinalClass {
	  //public void display() {
	   // System.out.println("This is a final method.");
	  //}
	//}

	class Main extends FinalClass {
	  public  void display() {
	    System.out.println("The final method is overridden.");
	  }

	  public static void main(String[] args) {
	    Main obj = new Main();
	    obj.display();
	  }
	}


}
