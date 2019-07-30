package de.xezzco.kicker.repository;

import de.xezzco.kicker.domain.Partie;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Xezz on 30.07.2019.
 */
public interface PartieRepository extends CrudRepository<Partie, UUID> {
}
