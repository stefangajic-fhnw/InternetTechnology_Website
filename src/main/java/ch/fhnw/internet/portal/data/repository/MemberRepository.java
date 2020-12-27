package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Job;
import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.data.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(Integer id);

    Member findMemberByEmail(String email);

    Member findByEmailAndIdNot(String email, Integer memberId);

    Member findByPhone(String phone);

    Member findByJobs(Job jobs);

    List<Member> findByRole(Role role);
}
