package ch.fhnw.internet.portal.controller;

import ch.fhnw.internet.portal.data.domain.Book;
import ch.fhnw.internet.portal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books) {
        return bookService.saveBooks(books);
    }

    @GetMapping("/book")
    public List<Book> findAllBooks() {
        return bookService.getBook();
    }

    @GetMapping("/bookById/{id}")
    public Book findBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/bookByISBN/{isbn}")
    public Book findBookByISBN(@PathVariable int isbn) {
        return bookService.getBookByISBN(isbn);
    }

    @GetMapping("/bookByTitle/{title}")
    public List<Book> findBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @GetMapping("/bookBySubtitle/{subtitle}")
    public List<Book> findBookBySubtitle(@PathVariable String subtitle) {
        return bookService.getBookBySubtitle(subtitle);
    }

    @GetMapping("/bookByAuthor/{author}")
    public List<Book> findBookByAuthor(@PathVariable String author) {
        return bookService.getBookByAuthor(author);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}
