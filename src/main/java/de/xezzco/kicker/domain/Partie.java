package de.xezzco.kicker.domain;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Xezz on 26.07.2019.
 * Eine Partie besteht aus zwei Teams die gegen einander spielen
 * Die Partie hat einen Spielstand, bzw. ein Ergebnis das sich aus dem Spielstand ergibt
 * Die Regeln hierzu sollten eigentlich einfach sein, die Frage ist wie das am Besten zu modellieren ist
 * Haben wir einfach nur Zustandsänderungen auf die wir reagieren oder sind sie Teil des Spielstands
 * (Besser reagieren, erste Wurf wohl eher direkt heim und auswärts, aber schlechter)
 */
@Entity
public class Partie {

    @Id
    @GeneratedValue
    private UUID partieId;
    @ManyToOne
    @JoinColumn(name = "heimTeam")
    private Team heimTeam;
    @ManyToOne
    @JoinColumn(name = "auswaertsTeam")
    private Team auswaertsTeam;
    private int toreHeimTeam;
    private int toreAuswaertsTeam;

    public UUID getPartieId() {
        return partieId;
    }

    public void setPartieId(UUID partieId) {
        this.partieId = partieId;
    }

    public int getToreHeimTeam() {
        return toreHeimTeam;
    }

    public void setToreHeimTeam(int toreHeimTeam) {
        this.toreHeimTeam = toreHeimTeam;
    }

    public int getToreAuswaertsTeam() {
        return toreAuswaertsTeam;
    }

    public void setToreAuswaertsTeam(int toreAuswaertsTeam) {
        this.toreAuswaertsTeam = toreAuswaertsTeam;
    }
/*
    public Team getHeimTeam() {
        return heimTeam;
    }

    public void setHeimTeam(Team heimTeam) {
        this.heimTeam = heimTeam;
    }

    public Team getAuswaertsTeam() {
        return auswaertsTeam;
    }

    public void setAuswaertsTeam(Team auswaertsTeam) {
        this.auswaertsTeam = auswaertsTeam;
    }*/
}
