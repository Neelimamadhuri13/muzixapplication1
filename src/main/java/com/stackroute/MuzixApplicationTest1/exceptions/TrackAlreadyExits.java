package com.stackroute.MuzixApplicationTest1.exceptions;

public class TrackAlreadyExits extends Exception {
    private String messege;
    public TrackAlreadyExits(String messege){
        super(messege);
        this.messege=messege;
    }

    public TrackAlreadyExits() {
    }
}
