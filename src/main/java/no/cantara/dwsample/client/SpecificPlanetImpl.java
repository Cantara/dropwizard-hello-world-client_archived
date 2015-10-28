package no.cantara.dwsample.client;

import no.cantara.dwsample.api.Planet;
import no.cantara.dwsample.api.SpecificPlanet;

public class SpecificPlanetImpl implements SpecificPlanet {

    private Planet planet;

    public SpecificPlanetImpl() {
    }

    public SpecificPlanetImpl(Planet planet) {
        this.planet = planet;
    }

    @Override
    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecificPlanetImpl that = (SpecificPlanetImpl) o;

        return !(planet != null ? !planet.equals(that.planet) : that.planet != null);

    }

    @Override
    public int hashCode() {
        return planet != null ? planet.hashCode() : 0;
    }
}
