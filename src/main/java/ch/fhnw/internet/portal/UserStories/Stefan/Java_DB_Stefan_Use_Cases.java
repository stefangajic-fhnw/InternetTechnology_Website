package ch.fhnw.internet.portal;

import ch.fhnw.internet.portal.UserStories.Stefan.Encrypt;
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
    //----------------------
// UC 4.1 --> searches either for matching title, subtitle, comment or ISBN
    public void SearchBook(String s) {
        int digitcounter = 0;            // some business logic we need here
        for (int i = 0; i < 3; i++) {
            char c = s.charAt(i);
            if (c.isDigit()) {
                digitcounter++;
            }
        }
        if (digitcounter == 3) {
            if (s.charAt(3).equals('.') && s.charAt(4).isDigit()) {
                String query = "select id, title, subtitle, isbn from book where isbn like '" + s + "%'";    // One possible "result"
            }
        } else {
            String query = "select id, title, subtitle, isbn from book where title like '" + s + "%' or subtitle like '" + s + "%' or comment like '" + s + "%';";
        }
    }




    // UC 5.1 --> Accesses book, "display" not implemented yet
    public void AccessBook(Integer idE) {
        String query = "select * from book where id ="+idE+";";

    }
    // UC 6 --> takes attributes that remain the same as null values, id can not be changed!
    // Ahsan's password change has to be added here
    public void updateMember (integer idE, string phoneN, sting emailN, role roleN){
        if (role != null) {  // changes only role if different
            String query = "UPDATE member SET role ='"+ roleN + "' WHERE id ='"+ idE+"';";
        }
        if (phoneN != null){
            String query = "UPDATE member SET phone='"+phoneN +"' WHERE id="+idE+"';";
        }
        if(emailN != null){
            String query = "UPDATE member SET email ='"+ emailN + "' WHERE id '"+ idE+"';";
        }
    }
    // UC 8 --> Id needed
    public void deleteMember (integer idE){
        String query = "delete from member where id='" + idE +"';";

    }