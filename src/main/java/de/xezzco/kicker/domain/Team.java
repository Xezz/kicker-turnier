package de.xezzco.kicker.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Der oder die Spieler die ein Team einer Partie sind
 */
@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    private UUID teamId;
    @OneToMany
    private Set<Spieler> teamMitglieder;
}
