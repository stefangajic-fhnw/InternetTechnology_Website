/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.UserStories.Stefan;



import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



@Service
@Validated
public class UC_4_1_SearchBook {


        public static void main(String[] args) {

                public void SearchBook(String s){
                        Connection conn = null;
                        try {
                                String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
                                conn = DriverManager.getConnection(url);

                                int digitcounter =0;
                                for (int i = 0; i < 3; i++){
                                        char c = s.charAt(i);
                                        if(c.isDigit()){
                                                digitcounter++;
                                        }
                                }
                                if(digitcounter==3){
                                        ;
                                        if (s.charAt(3).equals('.'){
                                                Statement stmt = null;
                                                String query = "select id, title, subtitle, isbn from book where isbn like ("s %")";
                                        }
                                } else{
                                        Statement stmt = null;
                                        String query = "select id, title, subtitle, isbn from book where (title like  s + "%") or (subtitle like s + "%")";
                                }

                                try {
                                        stmt = conn.createStatement();
                                        ResultSet rs = stmt.executeQuery(query);
                                        while (rs.next()) {
                                                String name = rs.getString("title");
                                                System.out.println(name);
                                        }
                                } catch (SQLException e) {
                                        throw new Error("Problem", e);
                                } finally {
                                        if (stmt != null) {
                                                stmt.close();
                                        }
                                }

                        } catch (SQLException e) {
                                throw new Error("Problem", e);
                        } finally {
                                try {
                                        if (conn != null) {
                                                conn.close();
                                        }
                                } catch (SQLException ex) {
                                        System.out.println(ex.getMessage());
                                }
                        }
                }
        }
}