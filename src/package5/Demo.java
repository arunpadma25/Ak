package package5;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<String> d1 = new Data<>("This is d1");
		System.out.println(d1.toString());

		Data<Integer> d2 = new Data<>(10);
		System.out.println(d2.toString());
		
		IData<String> d3 = new Data<>("We have imple a gemeric");
		System.out.println(d3.toString());
		
	}

}
