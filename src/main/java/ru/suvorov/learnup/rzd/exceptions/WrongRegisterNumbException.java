package ru.suvorov.learnup.rzd.exceptions;

public class WrongRegisterNumbException extends RuntimeException{

    public WrongRegisterNumbException() {
        super("Регистрационный номер поезда не может содержать пробелов!");
    }

}
