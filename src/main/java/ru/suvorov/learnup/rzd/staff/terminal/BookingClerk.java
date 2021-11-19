package ru.suvorov.learnup.rzd.staff.terminal;

import ru.suvorov.learnup.rzd.staff.Employee;

public class BookingClerk extends Employee {
    public BookingClerk(String name, short age) {
        super(name, age);
    }

    public BookingClerk(String name, short age, short experience) {
        super(name, age, experience);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + ": selling tickets...");
    }

}
