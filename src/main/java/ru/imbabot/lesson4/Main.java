package ru.imbabot.lesson4;

import java.util.Arrays;

public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    private static float[] method1() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);

        return arr;

    }

    private static float[] method2() {
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        float[] first = new float[h];
        float[] second = new float[h];


        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, 0, h);

        Thread t1 = new Thread(new ArrThread(first, 0));
        Thread t2 = new Thread(new ArrThread(second, h));

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(second, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);

        return arr;

    }

    public static void main(String[] args) {
        float[] first = method1();
        float[] second = method2();



        System.out.println(Arrays.equals(first, second));

    }
}
