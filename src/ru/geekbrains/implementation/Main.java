package ru.geekbrains.implementation;

import ru.geekbrains.competition.types.Cross;
import ru.geekbrains.competition.types.Wall;
import ru.geekbrains.competition.types.Water;
import ru.geekbrains.participants.Cat;
import ru.geekbrains.participants.Dog;
import ru.geekbrains.participants.Human;

public class Main {
        public static void main(String[] args) {
            Course c = new Course(new Cross(80), new Wall(5), new Water(100)); // Создаем полосу препятствий
            Team team = new Team("First command", new Human("Bob"), new Cat("Baksik"), new Dog("Bobick"), new Human("Ivan")); // Создаем команду
            c.doIt(team); // Просим команду пройти полосу
            team.showResults(); // Показываем результаты
        }
    }
