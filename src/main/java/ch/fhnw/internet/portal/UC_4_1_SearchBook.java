package ch.fhnw.internet.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class UC_4_1_SearchBook {

	public static void main(String[] args) {
		SpringApplication.run(UC_4_1_SearchBook.class, args);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("http://localhost/phpmyadmin/db_" +
					"structure.php?server=1&db=semester03_internet_technology_website", "root", "");
			System.out.print("Database is connected !");
			conn.close();
		} catch (Exception e) {
			System.out.print("Do not connect to DB - Error:" + e);
		}


	}

}
