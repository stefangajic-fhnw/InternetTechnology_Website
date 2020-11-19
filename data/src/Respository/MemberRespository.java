package Respository;

import DataBase.Member;

@Repository
public interface MemberRespository extends JpaRepository<Member, Long> {
    Member findByE_Mail(String E_Mail);
    Member findByPhoneNo(String PhoneNo);
    Member findByJob_ID(Integer Job_ID);
    Member findById(Long Id);
}