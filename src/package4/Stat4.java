package package4;

public class Stat4 {

	static int one = 3;
	String str = "tsst";
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
		Stat4 s1 = new Stat4();
		Stat4 s4 = new Stat4();
		
		
		s1.one += 1;
		System.out.println(one++);
		System.out.println(s4.one);
		System.out.println(s1.one);
		
	}
}
