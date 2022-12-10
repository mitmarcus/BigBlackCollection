package model;
import java.time.LocalDate;
import java.util.ArrayList;
//mark

public class GameReservationList {
    private ArrayList<GameReservation> reservationList;
    public GameReservationList() {
        reservationList = new ArrayList<GameReservation>();
    }

    public void addReservation(GameReservation reservation)
    {
        reservationList.add(reservation);
    }

    public void removeReservation(GameReservation reservation)
    {
        reservationList.remove(reservation);
    }

    public ArrayList<GameReservation> getReservationList()
    {
        return reservationList;
    }


    public GameReservation getGameReservation(Game game) {
        for (GameReservation reservation : reservationList) {
            if (reservation.getGame() == game) {
                return reservation;
            }
        }
        return null;
    }

    public GameReservation getGameReservationAtPosition(int index) {
        return reservationList.get(index);
    }

    public LocalDate getBorrowDateForAGame(Game game) {
        for (GameReservation reservation : reservationList) {
            if (reservation.getGame() == game) {
                return reservation.getFromDate();
            }
        }
        return null;
    }

    public LocalDate getReturnDateForAGame(Game game) {
        for (GameReservation reservation : reservationList) {
            if (reservation.getGame() == game) {
                return reservation.getToDate();
            }
        }
        return null;
    }

    public User getGameLentTo(Game game) {
        for (GameReservation reservation : reservationList) {
            if (reservation.getGame() == game) {
                return reservation.lentTo();
            }
        }
        return null;
    }

    public int getReservationListSize() {
        return reservationList.size();
    }

    public GameReservation getReservationByIndex(int index)
    {
        return reservationList.get(index);
    }
}
