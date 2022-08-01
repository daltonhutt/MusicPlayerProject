package com.ust.musicplayerapp;

public class Song {
   String title;
   double duration;

    public Song() {
    }

    public Song(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
