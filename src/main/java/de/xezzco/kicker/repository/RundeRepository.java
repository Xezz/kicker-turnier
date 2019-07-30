package de.xezzco.kicker.repository;

import de.xezzco.kicker.domain.Runde;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Xezz on 30.07.2019.
 */
public interface RundeRepository extends CrudRepository<Runde, UUID> {
}
