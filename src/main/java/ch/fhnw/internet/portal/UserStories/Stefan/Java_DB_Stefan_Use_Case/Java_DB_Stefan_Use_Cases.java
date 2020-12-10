package ch.fhnw.internet.portal.UserStories.Stefan.Java_DB_Stefan_Use_Case;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class  Java_DB_Stefan_Use_Cases{

    public static void main(String[] args) {
        SpringApplication.run(Java_DB_Stefan_Use_Cases.class, args);
        String rs1 = null, rs2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/semester03_internet_technology_website", "root", "");
            System.out.print("Database is connected!        ");




            String qry =  "Select * from book;";
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(qry);

            while (rs.next()){
                rs1 = rs.getString(1) ;

            }

            conn.close();
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
        }

        System.out.println(rs1);

    }

}


