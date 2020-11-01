package library.management.system.using.java.and.mysql;

import java.sql.*;

public class conn {
	Connection c;
	Statement s;

	public conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///project7?autoReconnect=true&useSSL=false", "root", "1234");
			s = c.createStatement();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
