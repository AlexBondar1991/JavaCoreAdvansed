package ru.geekbrains.competition.types;

import ru.geekbrains.implementation.Competitor;
import ru.geekbrains.implementation.Obstacle;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public String doit(Competitor competitor) {
        return competitor.swim(length);
    }
}