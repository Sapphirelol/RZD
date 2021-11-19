package ru.suvorov.learnup.rzd.staff.terminal;

import ru.suvorov.learnup.rzd.staff.Employee;

public class Manager extends Employee {
    public Manager(String name, short age, short experience) {
        super(name, age, experience);
    }

    public Manager(String name, short age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + ": moving with hands, calling...");
    }
}
