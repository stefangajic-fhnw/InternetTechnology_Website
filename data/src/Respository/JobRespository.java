package Respository;

import DataBase.Institute;
import DataBase.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    Job findByBook_ID(String Book_ID);
    Job findByMember_ID(Integer Member_ID);
    Job findById(Long Id);
}