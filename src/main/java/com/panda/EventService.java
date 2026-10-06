package com.panda;

import java.util.HashMap;

public class EventService {
    public HashMap<Integer, Event> events = new HashMap<>();
    public void addEvent (Event event){
        events.put (event.id , event);
    }
    public void printAllEvents(){
        for (Event event : events.values()) {
            System.out.println(event.id + " " + event.title + " " + event.price);
        }
    }
    public void buyTicket (Event event, Seat seat){
         Hall hall = event.getHall();
         if (!hall.seats.containsKey(seat)) {
             throw new SeatNotFoundException("No seat found for seat " + seat);
         }
         Status curStatus = hall.seats.get(seat);
         if (curStatus == Status.FREE){
             System.out.println("Succesfully buy a ticket");
             hall.seats.put(seat, Status.OCCUPIED);
         }
         else{
             throw new SeatAlreadyOccupiedException("Seat " + seat + " already occupied");
         }
    }
    public Event getEventById(int id){
        return events.get(id);
    }
}
