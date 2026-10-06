package com.panda;
import java.time.LocalDateTime;

public class Event {
    int id;
    public String title;
    public double price;
    public Hall hall;

    public Event (int id, String title, double price, Hall hall) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.hall = hall;
    }
    public Hall getHall(){
        return hall;
    }

}
