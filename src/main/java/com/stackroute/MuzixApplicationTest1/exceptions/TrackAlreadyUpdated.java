package com.stackroute.MuzixApplicationTest1.exceptions;

public class TrackAlreadyUpdated extends Exception {
    public TrackAlreadyUpdated() {
    }

    public TrackAlreadyUpdated(String messege) {
        super(messege);
        this.messege = messege;
    }

    private String messege;

}
