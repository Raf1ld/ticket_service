package com.panda;

public class SeatAlreadyOccupiedException extends RuntimeException {
    public SeatAlreadyOccupiedException(String message) {
        super(message);
    }

}
