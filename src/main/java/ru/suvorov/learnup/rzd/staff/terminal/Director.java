package ru.suvorov.learnup.rzd.staff.terminal;

import ru.suvorov.learnup.rzd.staff.Employee;

public class Director extends Employee {
    public Director(String name, short age) {
        super(name, age);
    }

    public Director(String name, short age, short experience) {
        super(name, age, experience);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + ": раздает указания...");
    }
}
