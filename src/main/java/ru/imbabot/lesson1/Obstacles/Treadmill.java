package ru.imbabot.lesson1.Obstacles;

import ru.imbabot.lesson1.Participants.Participants;

public class Treadmill implements Obstacles{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participants participants) {
        System.out.println(participants.run(distance));
    }
}
