package model;

import java.time.LocalDate;

/**
 * A class that stores the Reservation
 *
 * @author Marcus Mitelea
 */
public class Reservation {
    private String borrower;
    private String gameName;
    private LocalDate fromDate;
    private LocalDate toDate;

    /**
     * Four-argument constructor initializing the Reservation
     *
     * @param borrower  the borrower to initialize
     * @param gameName  the game name to initialize
     * @param fromDate  the from which date it was borrowed to initialize
     * @param toDate    the to date it should be returned to initialize
     */
    public Reservation(String borrower, String gameName, Object fromDate, Object toDate) {
        this.borrower = borrower;
        this.gameName = gameName;
        this.fromDate = (LocalDate) fromDate;
        this.toDate = (LocalDate) toDate;
    }

    /**
     * Gets the borrower from the Reservation
     *
     * @return the borrower as a String
     */
    public String lentTo() {
        return borrower;
    }

    /**
     * Gets the game name from the Reservation
     *
     * @return the game name as a String
     */
    public String getGame() {
    return gameName;
  }

    /**
     * Gets the start Date of the Reservation
     *
     * @return the start Date as a LocalDate
     */
    public LocalDate getFromDate() {
        return fromDate;
    }

    /**
     * Gets the end Date of the Reservation
     *
     * @return the end Date as a LocalDate
     */
    public LocalDate getToDate() {
        return toDate;
    }

    /**
     * Checks if the Reservation is the same as the other Object
     *
     * @param obj the Object to check with
     * @return true if the Object obj is the same as the Reservation, else false
     */
    @Override public boolean equals(Object obj){
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        Reservation other = (Reservation) obj;
        return (borrower.equals(other.borrower) && gameName.equals(other.gameName) && fromDate.equals(other.fromDate) && toDate.equals(other.toDate));
    }
}

