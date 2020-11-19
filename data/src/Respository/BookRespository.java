package Respository;

import DataBase.Author;
import DataBase.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String Title);
    Book findBySubtitle(String Subtitle);
    Book findById(Long Id);
    Book findByISBN(Integer ISBN);
    List<Book> findByAuthor_ID(Integer Author_ID);
    List<Book> findByLocation_ID(Integer Location_ID);
}