package model;
import java.util.ArrayList;
//mark

public class GameReservationList {
    private ArrayList<GameReservation> reservations;

    public GameReservationList()
    {
        reservations = new ArrayList<GameReservation>();
    }

    public void addGameReservation(GameReservation reservation)
    {
        reservations.add(reservation);
    }

    public boolean removeGameReservation(GameReservation reservation)
    {
        return reservations.remove(reservation);
    }

    public ArrayList<GameReservation> getReservations()
    {
        return reservations;
    }
}
