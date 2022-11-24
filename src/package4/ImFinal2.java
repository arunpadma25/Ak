package package4;

public class ImFinal2 {

	static class FinalDemo {
	    public final void display() {
	      System.out.println("This is final method.");
	    }
	}

	//class Main extends FinalDemo {
	  //public final void display() {
	  //  System.out.println("overridden.");
	  //}

	  public static void main(String[] args) {
	    Main obj = new Main();
	    obj.display();
	  }
	}

}
