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
 * Der Spieler und Turnierteilnehmer
 * Ist erstmal ein Name (Nickname, sollte halt identifzierbar sein über mehrere Turniere)
 */
@Entity
@Getter
@Setter
public class Spieler {

    @Id
    @GeneratedValue
    private UUID spielerId;
    private String name;
    @OneToMany
    private Set<Team> teams;
}
