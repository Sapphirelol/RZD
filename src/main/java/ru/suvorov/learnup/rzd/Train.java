package ru.suvorov.learnup.rzd;

import ru.suvorov.learnup.rzd.exceptions.WrongRegisterNumbException;
import ru.suvorov.learnup.rzd.interfaces.Announcer;

public class Train implements Announcer {
    private String registerNumb;
    private int carriageCount;
    private String name;
    private TrainType type;

    public Train(String registerNumb, int carriageCount, String name, TrainType type) {
        if (registerNumb.contains(" ")) throw new WrongRegisterNumbException();
        this.registerNumb = registerNumb;
        this.carriageCount = carriageCount;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Поезд '" + name + '\'' +
                "номер поезда - '" + registerNumb + '\'' +
                ", кол-во вагонов - " + carriageCount +
                ", тип - " + type + "\n";
    }

    public String getRegisterNumb() {
        return registerNumb;
    }

    public void setRegisterNumb(String registerNumb) {
        this.registerNumb = registerNumb;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainType getType() {
        return type;
    }

    public void setType(TrainType type) {
        this.type = type;
    }
}
