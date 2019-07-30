package de.xezzco.kicker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Der Spieler und Turnierteilnehmer
 * Ist erstmal ein Name (Nickname, sollte halt identifzierbar sein über mehrere Turniere)
 */
@Entity
public class Spieler {

    @Id
    @GeneratedValue
    private UUID spielerId;
    private String name;

    public UUID getSpielerId() {
        return spielerId;
    }

    public void setSpielerId(UUID spielerId) {
        this.spielerId = spielerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
