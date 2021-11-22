package ru.suvorov.learnup.rzd;

public class Station {
    private String name;
    private StationType type;

    public Station(String name, StationType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Станция - '" + name + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StationType getType() {
        return type;
    }

    public void setType(StationType type) {
        this.type = type;
    }
}
