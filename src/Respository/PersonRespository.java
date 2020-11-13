package Respository;

import DataBase.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findById(Long Id);
    List<Person> findByInstitute_ID(Integer Institute_ID);
    Person findByName(String Name);
    Person findByFullName(String Name, String FirstName);

}