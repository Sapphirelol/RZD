package ru.suvorov.learnup.rzd.staff.train;

import ru.suvorov.learnup.rzd.staff.Employee;

import java.util.Random;

public class Conductor extends Employee {
    public Conductor(String name, short age, short experience) {
        super(name, age, experience);
    }

    public Conductor(String name, short age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.print(this.getName());
        if (new Random().nextBoolean()) {
            System.out.println(": checking passenger tickets...");
        } else {
            System.out.println(": offer tea to passengers...");
        }
    }
}