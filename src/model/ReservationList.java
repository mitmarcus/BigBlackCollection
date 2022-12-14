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

    /**
     * Get the number of reservations in the list as an integer
     *
     * @return integer representing the number of reservations in the list
     */
    public int getReservationListSize() {
        return reservationList.size();
    }

    /**
     * Get Reservation object from the list at a specific index
     *
     * @param index the index of the Reservation object
     * @return Reservation object at index
     */
    public Reservation getReservationByIndex(int index)
    {
        return reservationList.get(index);
    }
}
