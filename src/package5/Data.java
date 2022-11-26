package package5;


public class Data<T> implements IData<T> {  //T - type param

	private T date;
	
	public Data(T date) {
		this.date = date;
	}

	@Override
	public T getDate() {
		return date;
	}

	@Override
	public void setDate(T date) {
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Data is "+ date;
	}
	
	
}

/*
 * public class Data { //T - type param
 * 
 * private String date;
 * 
 * public Data(String date) { this.date = date; }
 * 
 * public String getDate() { return date; }
 * 
 * public void setDate(String date) { this.date = date; }
 * 
 * @Override public String toString() { // TODO Auto-generated method stub
 * return "Data is "+ date; }
 * 
 * 
 * }
 */
