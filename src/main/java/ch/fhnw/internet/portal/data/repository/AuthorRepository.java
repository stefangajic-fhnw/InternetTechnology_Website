/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Author;
import ch.fhnw.internet.portal.data.domain.Book;
import ch.fhnw.internet.portal.data.domain.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	Author findById(Integer id);
	List<Author> findByBook(Book book);
	List<Author> findByName(String name);
	List<Author> findByNameAndFirstName(String name, String firstName);
	List<Author> findByInstitute(Institute institute);
	List<Author> findByLegalNotice(String LegalNotice);
}
