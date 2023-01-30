package ru.imbabot.lesson2;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int first, int second){
        super(String.format("Invalid data [%d][%d]", first, second));
    }
}
