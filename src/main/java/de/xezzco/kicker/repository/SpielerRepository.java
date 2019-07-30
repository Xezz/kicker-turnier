package de.xezzco.kicker.repository;

import de.xezzco.kicker.domain.Spieler;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Xezz on 30.07.2019.
 * Einfaches CRUD Repo
 */
public interface SpielerRepository extends CrudRepository<Spieler, UUID> {
}
