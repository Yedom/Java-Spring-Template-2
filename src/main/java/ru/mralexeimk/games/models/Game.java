package ru.mralexeimk.games.models;

import java.util.List;

public abstract class Game {
    private int id;
    private String title;
    private List<Person> players;

    public Game() {

    }
}
