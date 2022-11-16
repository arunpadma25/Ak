package package3;
import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListItrDemo {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<>();
		
		data.add("Raj");
		data.add("Ramesh");
		data.add("Amrish");
		data.add("jai");
		data.add("Khushal");
		
		System.out.println(data);
		
		ListIterator li = data.listIterator();
		
		while(li.hasNext())
		{
			String item = (String)li.next();		
			
			if(item.equals("jai"))
			{
				li.add("veeru");
			}
			if(item.equals("Raj"))
			{
				li.remove();
			}
			if(item.equals("Amrish"))
			{
				li.set("Amresh");
			}
		}
		
		System.out.println(data);
	}

}
