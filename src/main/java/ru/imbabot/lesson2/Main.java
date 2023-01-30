package ru.imbabot.lesson2;


import java.util.Arrays;

public class Main {

    private static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException(arr);
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (!arr[i][j].matches("[0-9]+")){
                    throw new MyArrayDataException(i,j);
                }else {
                    result += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        int a = 1;
        int b = 90;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = String.valueOf(a + (int) (Math.random() * b));
            }
        }
        arr[1][2] = "s";


        try {
            System.out.println(method(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
