package package1;
class Aexception2 {
	  public static void main(String[] args) {
	    try {
	      int divideByZero = 5 / 0;
	    }

	    catch (ArithmeticException e) {
	      System.out.println("A exception => " + e.getMessage());
	    }
	    
	    finally {
	      System.out.println("I'm finally block");
	    }
	  }
	}