package de.xezzco.kicker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Die Partien die an einer spezifischen Position gespielt werden
 */
@Entity
public class Runde {

    @Id
    @GeneratedValue
    private UUID rundeId;
    @OneToMany(mappedBy = "partieId")
    private Set<Partie> partienDerRunde;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public UUID getRundeId() {
        return rundeId;
    }

    public void setRundeId(UUID rundeId) {
        this.rundeId = rundeId;
    }

    public Set<Partie> getPartienDerRunde() {
        return partienDerRunde;
    }

    public void setPartienDerRunde(Set<Partie> partienDerRunde) {
        this.partienDerRunde = partienDerRunde;
    }
}
