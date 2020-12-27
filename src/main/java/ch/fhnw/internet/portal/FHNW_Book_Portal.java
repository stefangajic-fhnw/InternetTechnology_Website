package ch.fhnw.internet.portal;

import ch.fhnw.internet.portal.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FHNW_Book_Portal {
    public static void main(String[] args) {


        SpringApplication.run(FHNW_Book_Portal.class, args);
        IndexController.getIndexView();
    }
}