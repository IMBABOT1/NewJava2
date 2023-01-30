package ru.imbabot.lesson1.Participants;

public class Human implements Participants {

    private int maxDistance;
    private int maxHeight;
    private boolean isActive;

    public Human(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public boolean run(int distance) {
        if (isActive == true) {
            if (maxDistance >= distance) {
                System.out.println("human run success");
                return true;
            }
            isActive = false;
            System.out.println("human out of distance");
            return isActive;
        }else {
            System.out.println("human not active");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (isActive == true) {
            if (maxHeight >= height) {
                System.out.println("human jump success");
                return true;
            }
            isActive = false;
            System.out.println("human out of distance");
            return isActive;
        }else {
            System.out.println("human not active");
            return false;
        }
    }
}
