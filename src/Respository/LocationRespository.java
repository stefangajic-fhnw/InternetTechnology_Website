package Respository;

import DataBase.Job;
import DataBase.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findById(Long Id);
    Location findByBook_ID(String Book_ID);
    List<Location> findByInstitute(Institute Institute);

    List<Location> findByStreet(String Street);
    Location findByZIP(Integer ZIP);
    <Location> findByCorrespodence_ID(Integer Correspodence_ID);
}