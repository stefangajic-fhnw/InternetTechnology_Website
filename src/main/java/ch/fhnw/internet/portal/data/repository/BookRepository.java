package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findById(Integer id);

    Book findByISBN(Integer ISBN);

    List<Book> findByTitle(String title);

    List<Book> findBySubtitle(String subtitle);

    List<Book> findBooksByAuthors(String Authors);
}
