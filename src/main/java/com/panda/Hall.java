package com.panda;

import java.util.HashMap;

public class Hall {
    private int id;
    public HashMap<Seat, Status> seats;
    public String name;

    public Hall(int Id, String Name) {
        this.id = Id;
        this.name = Name;
        seats = new HashMap<>();
    }
    public void addSeat(Seat seat, Status status) {
        seats.put(seat, status);
    }
    public Seat GetSeat(Seat seat) {
        seats.get(seat);
        return seat;
    }
    public Status GetSeatStatus(Seat seat) {
        return seats.get(seat);
    }
    public void fullHall(int row_count, int seat_per_row){
        for (int i = 1; i <= row_count; i++) {
            for (int j = 1; j <= seat_per_row; j++) {
                Seat seat = new Seat(i, j);
                seats.put(seat, Status.FREE);
            }
        }
    }
}
