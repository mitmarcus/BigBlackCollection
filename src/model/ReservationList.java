package model;

import java.util.ArrayList;

/**
 * A class that stores the Reservation objects into a list
 *
 * @author Marcus Mitelea
 */
public class ReservationList {
    private ArrayList<Reservation> reservationList;

    /**
     * No-argument constructor initializing the list
     */
    public ReservationList() {
        reservationList = new ArrayList<>();
    }

    /**
     * Adds a Reservation to the list
     *
     * @param reservation the Reservation to add
     */
    public void addReservation(Reservation reservation)
    {
        reservationList.add(reservation);
    }

    /**
     * Removes a Reservation from the list
     *
     * @param reservation the Reservation to remove
     */
    public void removeReservation(Reservation reservation)
    {
        reservationList.remove(reservation);
    }


    public int getReservationListSize() {
        return reservationList.size();
    }
    public Reservation getReservationByIndex(int index)
    {
        return reservationList.get(index);
    }
}
