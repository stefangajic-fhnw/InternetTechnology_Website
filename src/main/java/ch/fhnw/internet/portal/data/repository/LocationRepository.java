/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.data.repository;

import ch.fhnw.internet.portal.data.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    // List<Location> findByStreet(String street);
    // List<Location> findByZipCode(Integer zipCode);
    // List<Location> findByCity(String city);
    // Location findById(Integer id);
    // List<Location> findByStreetAndBuildingNumber(String street, Integer buildingNumber);
    // List<Location> findByComment(String comment);
    // List<Location> findByCountry(String country);
    // List<Location> findByZipCorrespondence(Person correspondence);
    // List<Location> findByBook(Book book);

}
