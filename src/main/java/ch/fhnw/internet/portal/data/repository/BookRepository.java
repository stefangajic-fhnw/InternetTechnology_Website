/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Author;
import ch.fhnw.internet.portal.data.domain.Book;
import ch.fhnw.internet.portal.data.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Book findById(Integer id);
	List<Book> findByTitle(String title);
	List<Book> findBySubtitle(String subtitle);
	Book findByISBN(Integer ISBN);
	List<Book> findByLocation(Location Location);
	List<Book> findBooksByAuthor (Author Author);
}
