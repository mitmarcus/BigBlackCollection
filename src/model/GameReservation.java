package model;

import java.time.LocalDate;

public class GameReservation {
    private String borrower;
    private String gameName;
    private LocalDate fromDate;
    private LocalDate toDate;
    public GameReservation(String borrower, String game, Object fromDate, Object toDate) {
        this.borrower = borrower;
        this.gameName = game;
        this.fromDate = (LocalDate) fromDate;
        this.toDate = (LocalDate) toDate;
    }
    public String lentTo() {
        return borrower;
    }
    public String getGame() {
    return gameName;
  }
    public LocalDate getFromDate() {
        return fromDate;
    }
    public LocalDate getToDate() {
    return toDate;
  }
    @Override public boolean equals(Object obj){
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        GameReservation other = (GameReservation) obj;
        return (borrower.equals(other.borrower) && gameName.equals(other.gameName) && fromDate.equals(other.fromDate) && toDate.equals(other.toDate));
    }
}

