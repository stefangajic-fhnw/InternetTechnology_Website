package ch.fhnw.internet.portal.service;

import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.data.repository.BookRepository;

public class BookService {

    public  getCurrentBook() {            // I am not sure whether that will work?
        Integer id = BookRepository.getId();
        return BookRepository.findbyId(id);
    }
}
