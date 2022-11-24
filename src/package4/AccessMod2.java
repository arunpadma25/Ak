package package4;


public class AccessMod2 {

	public static class Animal {
	    public int legCount;
	    public void display() {
	        System.out.println("I am alien.");
	        System.out.println("I have " + legCount + " legs");
	    }
	}

	public class Main {
	    public static void main( String[] args ) {
	        Animal animal = new Animal();
	        animal.legCount = 4;
	        animal.display();
	    }
	}
}
