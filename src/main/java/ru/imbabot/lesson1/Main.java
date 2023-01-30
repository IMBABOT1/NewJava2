package ru.imbabot.lesson1;

import ru.imbabot.lesson1.Obstacles.Obstacles;
import ru.imbabot.lesson1.Obstacles.Treadmill;
import ru.imbabot.lesson1.Obstacles.Wall;
import ru.imbabot.lesson1.Participants.Cat;
import ru.imbabot.lesson1.Participants.Human;
import ru.imbabot.lesson1.Participants.Participants;
import ru.imbabot.lesson1.Participants.Robot;

public class Main {


    public static void main(String[] args) {
        Participants[] participants =
                {
                  new Cat(100, 200),
                  new Human(200, 1),
                  new Robot(500, 10)
                };

        Obstacles[] obstacles =
                {
                        new Wall(5),
                        new Treadmill(150)
                };

        for (Obstacles o : obstacles){
            for (Participants p : participants){
                o.doIt(p);
            }
        }
    }
}
