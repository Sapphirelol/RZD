package ru.suvorov.learnup.rzd.exceptions;

public class LowStationsCountExceptions extends RuntimeException {
    public LowStationsCountExceptions() {
        super("Указано менее 2х станций в маршруте!");
    }
}
