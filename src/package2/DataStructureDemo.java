package package2;
import java.util.ArrayList;
public class DataStructureDemo {
     public static void main(String[] args) {
         String[] strArray = new String[20];
         Employee[] empArray = new Employee[20];
         strArray[0]= "Arun";
          ArrayList l = new ArrayList();
         l.add("Meenal");
         l.add(new Employee());
         Employee name = (Employee) l.get(0);
     }
}
