package de.xezzco.kicker.repository;

import de.xezzco.kicker.domain.Spieler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by Xezz on 30.07.2019.
 * Einfaches CRUD Repo
 */
@RepositoryRestResource(path = "spieler")
public interface SpielerRepository extends CrudRepository<Spieler, UUID> {
}
