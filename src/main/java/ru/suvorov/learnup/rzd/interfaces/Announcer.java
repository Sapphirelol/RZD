package ru.suvorov.learnup.rzd.interfaces;

public interface Announcer {
    default void toAnnounce(String announcement) {
        System.out.println("ВНИМАНИЕ! " + announcement);
    }
}
