package com.panda;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventService eventService = new EventService();
        Hall hall_1 = new Hall(1, "MTS hall");
        hall_1.fullHall(3,7);
        Event event_1 = new Event(1,"Igromir", 3600, hall_1);
        Hall hall_2 = new Hall(2, "VTB hall");
        hall_2.fullHall(8,6);
        Event event_2 = new Event(2,"Alpha Fest", 500, hall_2);
        Hall hall_3 = new Hall(3, "Sber hall");
        hall_3.fullHall(11,22);
        Event event_3 = new Event(3,"Kanye West Concert", 21000, hall_3);
        eventService.addEvent(event_1);
        eventService.addEvent(event_2);
        eventService.addEvent(event_3);
        Scanner sc = new Scanner(System.in);
        boolean token = true;
        while (token) {
            System.out.println("1. Buy Tickets");
            System.out.println("2. This is the end!");
            switch (sc.next()) {
                case "1" ->  {
                        System.out.println("Choose an event");
                        eventService.printAllEvents();
                        int event_id = sc.nextInt();
                        Event selected_event = eventService.getEventById(event_id);
                        if (selected_event != null) {
                            System.out.println("Choose a row: ");
                            int row = sc.nextInt();
                            System.out.println("Choose a seat: ");
                            int seat = sc.nextInt();
                            if (row <= 0 || seat <= 0) {
                                throw new IllegalArgumentException("row and seat must be greater than 0");
                            }
                            Seat seat_obj = new Seat(row,seat);
                            eventService.buyTicket(selected_event, seat_obj);
                        }
                        else {
                            throw new EventNotFoundException("Event not found");
                        }



                }
            }


        }
    }
}