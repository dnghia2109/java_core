package model;

import model.Film;

public class Serial extends Film {
    private int episode, avrTime;

    public Serial(String id, String title, String category, String director, String premiereDay, int episode, int avgTime) {
        super(id, title, category, director, premiereDay);
        this.episode = episode;
        this.avrTime = avrTime;
    }

    public Serial() {

    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getAvgTime() {
        return avrTime;
    }

    public void setAvrTime(int avrTime) {
        this.avrTime = avrTime;
    }

    @Override
    public String toString() {
        return "model.Serial{" + super.toString() +
                "episode=" + episode +
                ", avrTime=" + avrTime +
                '}';
    }
}
