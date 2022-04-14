package model;

import model.Film;

public class Movie extends Film {
    private int time;

    public Movie(String id, String title, String category, String director, String premiereDay, int time) {
        super(id, title, category, director, premiereDay);
        this.time = time;
    }

    public Movie() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "model.Movie{" + super.toString() +
                "time=" + time +
                '}';
    }
}
