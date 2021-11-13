package ro.ctrln.classes;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class Star {
    private String starDescription; //Variabila de instanta.
    private int diameter; //Variabila de instanta.
    private int satellites; //Variabila de instanta.
    private BigDecimal mass; //Variabila de instanta.
    private SmallPlanet smallPlanet; //Variabila de instanta.

    public static final boolean MILKYWAYSTAR = true; // Variabila de clasa.(constanta- se scrie cu litere mari denumirea)

    public Star() {
    }

    public Star(String starDescription, int diameter, int satellites, BigDecimal mass) {
        this.starDescription = starDescription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
    }

    public String getStarDescription() {
        return starDescription;
    }

    public void setStarDescription(String starDescription) {
        this.starDescription = starDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public void setSmallPlanet(SmallPlanet smallPlanet/*parametrul metodei*/) {
        this.smallPlanet/*variabila de instanta*/ = smallPlanet/*parametrul metodei*/;
    }
    public SmallPlanet getSmallPlanet() {
        return this.smallPlanet/*variabila de instanta*/;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return diameter == star.diameter && satellites == star.satellites && starDescription.equals(star.starDescription) && mass.equals(star.mass) && smallPlanet.equals(star.smallPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starDescription, diameter, satellites, mass, smallPlanet);
    }

    @Override
    public String toString() {
        return "Star{" +
                "starDescription='" + starDescription + '\'' +
                ", diameter=" + diameter +
                ", satellites=" + satellites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                '}';
    }

    public String computeSmallPlanetLocation (SmallPlanet smallPlanet, int location) {
        String planetLocation = this.starDescription + smallPlanet.getPlanetName() + location; //variabila locala
        return planetLocation ;
    }
}

class SmallPlanet {
    public String getPlanetName() {
        return this.planetName;
    };
    private String planetName;

}