package de.xezzco.kicker.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Der Turnier eines Turnier besteht aus einer Liste von Runden
 */
@Entity
@Getter
@Setter
public class Turnier {

    @Id
    @GeneratedValue
    private UUID turnierId;
    @OneToMany
    private Set<Runde> runden;
    @NotNull(message = "Ein gültiges Datum muss angegeben werden")
    private Date ausrichtungsdatum;
}
