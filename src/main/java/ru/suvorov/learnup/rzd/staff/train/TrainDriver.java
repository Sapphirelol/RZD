package ru.suvorov.learnup.rzd.staff.train;

import ru.suvorov.learnup.rzd.Route;
import ru.suvorov.learnup.rzd.staff.Employee;

public class TrainDriver extends Employee {
    public TrainDriver(String name, short age, short experience) {
        super(name, age, experience);
    }

    public TrainDriver(String name, short age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + ": checking train before departure...");
    }

    public void work(Route route) {
        System.out.println(this.getName() + ": driving train...");
    }
}
