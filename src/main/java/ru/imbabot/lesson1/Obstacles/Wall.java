package ru.imbabot.lesson1.Obstacles;

import ru.imbabot.lesson1.Participants.Participants;

public class Wall implements Obstacles{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participants participants) {
        System.out.println(participants.jump(height));
    }
}
