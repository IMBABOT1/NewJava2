package ru.imbabot.lesson1.Participants;

public class Robot implements Participants {

    private int maxDistance;
    private int maxHeight;

    private boolean isActive;

    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public boolean run(int distance) {
        if (isActive) {
            if (maxDistance >= distance) {
                System.out.println("robot run success");
                return true;
            } else {
                isActive = false;
                System.out.println("robot out of distance");
                return isActive;
            }
        } else {
            System.out.println("robot not active");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (isActive) {
            if (maxHeight >= height) {
                System.out.println("robot jump success");
                return true;
            } else {
                isActive = false;
                System.out.println("robot out of distance");
                return isActive;
            }
        } else {
            System.out.println("robot not active");
            return false;
        }
    }
}
