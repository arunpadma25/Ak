package package4;

public class AccessMod{
	static class Data {
	    private String name;

	    public String getName() {
	        return this.name;
	    }
	    public void setName(String name) {
	        this.name= name;
	    }
	}
	public class Main {
	    public static void main(String[] main){
	        Data d = new Data();
	        d.setName("Hi dude");
	        System.out.println(d.getName());
	    }
	}
	
	
	
}
