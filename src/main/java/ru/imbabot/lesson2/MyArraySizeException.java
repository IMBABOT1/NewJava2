package ru.imbabot.lesson2;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(String[][] arr){
        super(String.format("Invalid size [%d][%d]", arr.length, arr[0].length));
    }

}
