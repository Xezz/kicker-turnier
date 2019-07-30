package de.xezzco.kicker.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Der oder die Spieler die ein Team einer Partie sind
 */
@Entity
public class Team {

    @Id
    @GeneratedValue
    private UUID teamId;
    @OneToMany(mappedBy = "spielerId")
    private Set<Spieler> teamMitglieder;

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

    public Set<Spieler> getTeamMitglieder() {
        return teamMitglieder;
    }

    public void setTeamMitglieder(Set<Spieler> teamMitglieder) {
        this.teamMitglieder = teamMitglieder;
    }
}
