package de.xezzco.kicker.repository;

import de.xezzco.kicker.domain.Partie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by Xezz on 30.07.2019.
 */
@RepositoryRestResource(path = "partien")
public interface PartieRepository extends CrudRepository<Partie, UUID> {
}
