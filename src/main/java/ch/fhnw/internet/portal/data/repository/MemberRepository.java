/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

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
	Member findByEmail(String email);
	Member findByPhone(String phone);
	Member findByJob(Job job);
	List<Member> findByRole(Role role);
}
