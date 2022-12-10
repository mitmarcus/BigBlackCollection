package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class GameReservationList {
    private ArrayList<GameReservation> reservationList;
    public GameReservationList() {
        reservationList = new ArrayList<>();
    }
    public void addReservation(GameReservation reservation)
    {
        reservationList.add(reservation);
    }
    public void removeReservation(GameReservation reservation)
    {
        reservationList.remove(reservation);
    }
    public int getReservationListSize() {
        return reservationList.size();
    }
    public GameReservation getReservationByIndex(int index)
    {
        return reservationList.get(index);
    }
}
