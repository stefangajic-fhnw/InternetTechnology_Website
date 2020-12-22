/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	// Member findById(Integer id);
	 Member findMemberByEmail(String email);
	// Member findByPhone(String phone);
	// Member findByJob(Job job);
	// List<Member> findByRole(Role role);
}
