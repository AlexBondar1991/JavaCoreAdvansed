package ru.geekbrains.competition.types;

import ru.geekbrains.implementation.Competitor;
import ru.geekbrains.implementation.Obstacle;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public String  doit(Competitor competitor) {
        return competitor.run(length);
    }
}