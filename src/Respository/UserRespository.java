package Respository;

import DataBase.Institute;
import DataBase.User;

@Repository
public interface Userespository extends JpaRepository<User, Long> {
    User findByE_Mail(String E_Mail);
    User findByPhoneNo(String PhoneNo);
    User findByJob_ID(Integer Job_ID);
    User findById(Long Id);


}