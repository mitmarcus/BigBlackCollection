package model;
import java.time.LocalDate;
import java.util.ArrayList;
//mark

public class GameReservationList {
    private ArrayList<GameReservation> reservations;
    public GameReservationList() {
        reservations = new ArrayList<GameReservation>();
    }

    public void addReservation(GameReservation reservation)
    {
        reservations.add(reservation);
    }

    public void removeReservation(GameReservation reservation)
    {
        reservations.remove(reservation);
    }

    public ArrayList<GameReservation> getReservations()
    {
        return reservations;
    }


    public GameReservation getGameReservation(Game game) {
        for (GameReservation reservation : reservations) {
            if (reservation.getGame() == game) {
                return reservation;
            }
        }
        return null;
    }

    public GameReservation getGameReservationAtPosition(int index) {
        return reservations.get(index);
    }

    public LocalDate getBorrowDateForAGame(Game game) {
        for (GameReservation reservation : reservations) {
            if (reservation.getGame() == game) {
                return reservation.getFromDate();
            }
        }
        return null;
    }

    public LocalDate getReturnDateForAGame(Game game) {
        for (GameReservation reservation : reservations) {
            if (reservation.getGame() == game) {
                return reservation.getToDate();
            }
        }
        return null;
    }

    public User getGameLentTo(Game game) {
        for (GameReservation reservation : reservations) {
            if (reservation.getGame() == game) {
                return reservation.lentTo();
            }
        }
        return null;
    }
}
