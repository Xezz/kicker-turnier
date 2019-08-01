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
 * Die Partien die an einer spezifischen Position gespielt werden
 */
@Entity
@Getter
@Setter
public class Runde {

    @Id
    @GeneratedValue
    private UUID rundeId;
    @OneToMany
    private Set<Partie> partienDerRunde;
    private int position;
}
