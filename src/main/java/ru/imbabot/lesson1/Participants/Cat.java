package ru.imbabot.lesson1.Participants;

public class Cat implements Participants {

    private int maxDistance;
    private int maxHeight;
    private boolean isActive;

    public Cat(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public boolean run(int distance) {
        if (isActive) {
            if (maxDistance >= distance) {
                System.out.println("cat run success");
                return true;
            }else {
                isActive = false;
                System.out.println("cat out of distance");
                return isActive;
            }
        }else {
            System.out.println("Cat not active");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (isActive) {
            if (maxHeight >= height) {
                System.out.println("cat jump success");
                return true;
            }else {
                isActive = false;
                System.out.println("cat out of distance");
                return isActive;
            }
        }else {
            System.out.println("Cat not active");
            return false;
        }
    }
}
