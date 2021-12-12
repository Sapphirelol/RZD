package ru.suvorov.learnup.rzd;

import ru.suvorov.learnup.rzd.exceptions.LowStationsCountExceptions;
import ru.suvorov.learnup.rzd.exceptions.WrongRegisterNumbException;
import ru.suvorov.learnup.rzd.staff.Employee;
import ru.suvorov.learnup.rzd.staff.train.Conductor;
import ru.suvorov.learnup.rzd.staff.train.TrainDriver;

public class Main {
    public static void main(String[] args) {

        Station vitebskii = new Station("Витебский вокзал", StationType.TERMINAL);
        Station borovaya = new Station("Боровая", StationType.RAILWAY_STATION);

        try {
            Route route = new Route("Витбский", new Station[]{vitebskii});
        } catch (LowStationsCountExceptions e) {
            e.printStackTrace();
        }
        try {
            Train train = new Train("00452 ", 8, "Стрела", TrainType.PASSENGER);
        } catch (WrongRegisterNumbException e) {
            e.printStackTrace();
        }

        Employee passengerTrainDriver = new TrainDriver("Василий", (short) 25);
        Employee conductor = new Conductor("Зоя Геннадьевна",(short) 47);


    }
}
