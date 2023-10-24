package Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Th!nk$uper#12");
		Statement smt = con.createStatement();
		String s = "select * from city;";		
		ResultSet rs = smt.executeQuery(s);
		while(rs.next()) {
			String name = rs.getString("Name");
			System.out.print(name+" ");
			String pop = rs.getString("Population");
			System.out.println(pop);
		}
		con.close();

	}

}
