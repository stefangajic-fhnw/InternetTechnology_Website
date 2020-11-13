package Respository;

import DataBase.Book;
import DataBase.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long> {
    Institute findByName(String Name);
    Institute findByHead_ID(Integer Head_ID);
    Institute findById(Long Id);
    Institute findByLocation_ID(Integer Location_ID);

}
