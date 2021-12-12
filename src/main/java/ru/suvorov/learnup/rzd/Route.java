package ru.suvorov.learnup.rzd;

import ru.suvorov.learnup.rzd.exceptions.LowStationsCountExceptions;

import java.util.Arrays;

public class Route {
    private String name;
    private Station[] route;

    public Route(String name, Station[] route) {
        if (route.length < 2) throw new LowStationsCountExceptions();
        this.name = name;
        this.route = route;
    }

    @Override
    public String toString() {
        return "Маршрут '" + name + '\'' +
                ", остановки: " + Arrays.toString(route) + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Station[] getRoute() {
        return route;
    }

    public void setRoute(Station[] route) {
        this.route = route;
    }

    public Station getStationByIndex(int stationIndex) {
        return route[stationIndex];
    }

    public void setStationByIndex(int stationIndex, Station station) {
        this.route[stationIndex] = station;
    }
}
