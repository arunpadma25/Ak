package package1;

import java.sql.*;

public class dbPro {
  public static void main(String[] args) throws Exception {
	  Class.forName("org.sqlite.JDBC");
	  Connection con = DriverManager.getConnection("jdbc:sqlite:/c:\\Users\\arunp\\OneDrive\\Desktop\\Java\\Ak\\src\\package1\\DBS\\ak.db");
	  Statement stmt = con.createStatement();
	  ResultSet res = stmt.executeQuery("SELECT ID,NAME,AGE,CITY FROM user");
	  int id, age;
	  String name, city;
	  while(res.next()) {
		  id = res.getInt("ID");
		  name = res.getString("NAME");
		  age = res.getInt("AGE");
		  city = res.getString("CITY");
		  
		  System.out.print(id + " ");
		  System.out.print(name + " ");
		  System.out.print(age + " ");
		  System.out.println(city + " ");
	  }
	  stmt.close();
	  con.close();
  }
}
