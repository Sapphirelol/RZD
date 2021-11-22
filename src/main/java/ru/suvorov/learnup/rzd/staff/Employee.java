package ru.suvorov.learnup.rzd.staff;

public abstract class Employee {
    private String name;
    private short age;
    private short experience;

    public Employee(String name, short age, short experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Employee(String name, short age) {
        this.name = name;
        this.age = age;
        this.experience = 0;
    }

    public void go(Object from, Object to) {
        System.out.println(this.getName() + " идет от " + from.toString() + " к " + to.toString());
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Имя сотрудника - '" + name + '\'' +
                ", возраст - " + age + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public short getExperience() {
        return experience;
    }

    public void setExperience(short experience) {
        this.experience = experience;
    }
}
