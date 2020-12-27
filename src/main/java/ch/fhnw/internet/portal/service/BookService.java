package ch.fhnw.internet.portal.service;

import ch.fhnw.internet.portal.data.domain.Book;
import ch.fhnw.internet.portal.data.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> getBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public Book getBookByISBN(int isbn) {
        return bookRepository.findByISBN(isbn);
    }

    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> getBookBySubtitle(String subtitle) {
        return bookRepository.findBySubtitle(subtitle);
    }

    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findBooksByAuthors(author);
    }

    public String deleteBook(Long id) {
        bookRepository.deleteById(id);
        return bookRepository.getOne(id).getTitle() + "Book is removed !! ";
    }

    public Book updateBook(Book book) {
        Book existingBook = null;
        if (bookRepository.findById(book.getId()).isPresent()) {
            //assert existingBook != null;
            existingBook.setISBN(book.getISBN());
            existingBook.setTitle(book.getTitle());
            existingBook.setSubtitle(book.getSubtitle());
            existingBook.setComment(book.getComment());
            existingBook.setAuthors(book.getAuthors());

            return bookRepository.save(existingBook);
        } else {
            return null;
        }
    }
}
/*
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);
        existingBook.setISBN(book.getISBN());
        existingBook.setTitle(book.getTitle());
        existingBook.setSubtitle(book.getSubtitle());
        existingBook.setComment(book.getComment());
        existingBook.setAuthors(book.getAuthors());

        return bookRepository.save(existingBook);

 */