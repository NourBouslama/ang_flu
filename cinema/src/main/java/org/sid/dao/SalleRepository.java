package org.sid.dao;

import org.sid.entities.Cinema;
import org.sid.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource
@CrossOrigin("*")
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
