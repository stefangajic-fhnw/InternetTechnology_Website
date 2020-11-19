package Respository;


import DataBase.Author;

@Repository
    public interface AuthorRepository extends JpaRepository<Author, Long> {
        Author findByName(String Name);
        Author findByFullName(String Name, String FirstName);
        Author findById(Long Id);
        List<Author> findByWrittenBookISBN(Integer ISBN);
    }

