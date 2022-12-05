package model;
import java.util.ArrayList;
//mark

public class GameReservationList {
    private Game game;
    private User user;
    private ArrayList<GameReservation> reservations;
    private MyDate date;
    public GameReservationList(Game game) {
        this.game = game;
        reservations = new ArrayList<GameReservation>();
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

    public MyDate getBorrowDateForAGame(Game game) {
        for (GameReservation reservation : reservations) {
            if (reservation.getGame() == game) {
                return reservation.getFromDate();
            }
        }
        return null;
    }

    public MyDate getReturnDateForAGame(Game game) {
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

    public void addGameReservation(GameReservation reservation) {
        reservations.add(reservation);
    }

    public void removeGameReservation(GameReservation reservation) {
        reservations.remove(reservation);
    }

    public void editGameReservation(GameReservation reservation, Game game, MyDate fromDate, MyDate toDate, User user) {
        reservation.set(game, fromDate, toDate, user);
    }
}
