package model;
import java.time.LocalDate;
import java.util.ArrayList;
//mark

public class GameReservationList {
    private ArrayList<GameReservation> reservations;
<<<<<<< HEAD
    private LocalDate date;
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

    public void addGameReservation(GameReservation reservation) {
=======

    public void addReservation(GameReservation reservation) {
>>>>>>> 8118c697f7121309ec594d4c819aafbe31c03bd0
        reservations.add(reservation);
    }

    public boolean removeReservation(GameReservation reservation) {
        return reservations.remove(reservation);
    }

<<<<<<< HEAD
    public void editGameReservation(GameReservation reservation, Game game, LocalDate fromDate, LocalDate toDate, User user) {
        reservation.set(game, fromDate, toDate, user);
=======
    public ArrayList<GameReservation> getReservations() {
        return reservations;
>>>>>>> 8118c697f7121309ec594d4c819aafbe31c03bd0
    }
}

//    private Game game;
//    private User user;
//    private MyDate date;
//    public GameReservationList(Game game) {
//        reservations = new ArrayList<GameReservation>();
//    }
//    public GameReservation getGameReservation(Game game) {
//        for (GameReservation reservation : reservations) {
//            if (reservation.getGame() == game) {
//                return reservation;
//            }
//        }
//        return null;
//    }
//
//    public GameReservation getGameReservationAtPosition(int index) {
//        return reservations.get(index);
//    }
//
//    public MyDate getBorrowDateForAGame(Game game) {
//        for (GameReservation reservation : reservations) {
//            if (reservation.getGame() == game) {
//                return reservation.getFromDate();
//            }
//        }
//        return null;
//    }
//
//    public MyDate getReturnDateForAGame(Game game) {
//        for (GameReservation reservation : reservations) {
//            if (reservation.getGame() == game) {
//                return reservation.getToDate();
//            }
//        }
//        return null;
//    }
//
//    public User getGameLentTo(Game game) {
//        for (GameReservation reservation : reservations) {
//            if (reservation.getGame() == game) {
//                return reservation.lentTo();
//            }
//        }
//        return null;
//    }
//
//    public void addGameReservation(GameReservation reservation) {
//        reservations.add(reservation);
//    }
//
//    public void removeGameReservation(GameReservation reservation) {
//        reservations.remove(reservation);
//    }
//
//    public void editGameReservation(GameReservation reservation, Game game, MyDate fromDate, MyDate toDate, User user) {
//        reservation.set(game, fromDate, toDate, user);
//    }
//}
