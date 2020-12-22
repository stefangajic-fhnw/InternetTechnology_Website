/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findById(Integer id);
	List<Person> findByName(String name);
	List<Person> findByNameAndFirstName(String name, String firstName);
	List<Person> findByLegalNotice(String legalNotice);
	// List<Person> findPersonsByInstitute(Institute institute);

}
