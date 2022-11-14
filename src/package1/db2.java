package package1;

import java.sql.*;
import java.util.Scanner;

public class db2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager
				.getConnection("jdbc:sqlite:/c:\\Users\\arunp\\OneDrive\\Desktop\\Java\\Ak\\src\\package1\\DBS\\ak.db");
		Statement stmt = con.createStatement();
		ResultSet re;

		int id, age, choice;
		String name, city, qry;

		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);

		while (true) {

			System.out.println("SQL CRUD OPERATION");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT");
			System.out.println("5. EXIT");
			System.out.println("ENTER YOUR CHOICE");

			choice = in.nextInt();

			System.out.println("--------------------------------");

			switch(choice) {
			case 1:
				System.out.println("1. Insert new Data");
				
				System.out.println("Enter Name: ");
				name = str.nextLine();
				System.out.println("Enter Age: ");
				age = str.nextInt();
				System.out.println("Enter City: ");
				city = str.nextLine();
				
				qry = "insert into user (NAME,AGE,CITY) values(?,?,?)";

				stmt = con.prepareStatement(qry);
				
				((PreparedStatement) stmt).setString(1, name);
				((PreparedStatement) stmt).setInt(2, age);
				((PreparedStatement) stmt).setString(3, city);
				
				stmt.executeUpdate(city);
				System.out.println("Added Successfully");
				
				break;
			case 2:
				System.out.println("2. Updating a Data");
				break;
			case 3:
				System.out.println("3. Deleting a Data");
				break;
			case 4:
				System.out.println("4. Print all Data");
				re = stmt.executeQuery("SELECT * FROM user");
				while(re.next()) {
					  id = re.getInt("ID");
					  name = re.getString("NAME");
					  age = re.getInt("AGE");
					  city = re.getString("CITY");
					  
					  System.out.print(id + " ");
					  System.out.print(name + " ");
					  System.out.print(age + " ");
					  System.out.println(city + " ");
				  }
				break;
			case 5:
				System.out.println("5. Thank you");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
			System.out.println("-------------------------");
		}
		
		
	}
}
