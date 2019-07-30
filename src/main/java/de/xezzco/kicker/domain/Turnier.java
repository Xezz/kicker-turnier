package de.xezzco.kicker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Der Turnier eines Turnier besteht aus einer Liste von Runden
 */
@Entity
public class Turnier {

    @Id
    @GeneratedValue
    private UUID turnierId;
    @OneToMany(mappedBy = "rundeId")
    private Set<Runde> runden;

    public UUID getTurnierId() {
        return turnierId;
    }

    public void setTurnierId(UUID turnierId) {
        this.turnierId = turnierId;
    }

    public Set<Runde> getRunden() {
        return runden;
    }

    public void setRunden(Set<Runde> runden) {
        this.runden = runden;
    }
}
