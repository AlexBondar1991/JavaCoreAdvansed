package ru.geekbrains.competition.types;

import ru.geekbrains.implementation.Competitor;
import ru.geekbrains.implementation.Obstacle;

public class Wall extends Obstacle {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public String doit(Competitor competitor) {
        return competitor.jump(heigth);
    }
}