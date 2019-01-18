package com.stackroute.MuzixApplicationTest1.exceptions;

public class TrackNotFound extends Exception {
    public TrackNotFound() {
    }

    public TrackNotFound(String messege) {
        this.messege = messege;
    }

    private String messege;
}
