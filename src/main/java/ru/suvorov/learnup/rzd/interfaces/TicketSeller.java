package ru.suvorov.learnup.rzd.interfaces;

public interface TicketSeller {
    default void sellTicket() {
        System.out.print("продает билет");
    }
}
