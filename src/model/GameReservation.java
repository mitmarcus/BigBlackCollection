package model;
//mark

import java.time.LocalDate;

public class GameReservation {
 // private User user;
  //private Game game;
  private LocalDate fromDate;
  private LocalDate toDate;

  private String borrower;
  private String gameName;
 /*public GameReservation(User user, Game game, LocalDate fromDate, LocalDate toDate) {
    this.user = user;
    this.game = game;
    this.fromDate =  fromDate;
    this.toDate =  toDate;*/


  public GameReservation(String borrower, String game, Object fromDate, Object toDate) {
    this.borrower = borrower;
    this.gameName = game;
    this.fromDate = (LocalDate) fromDate;
    this.toDate = (LocalDate) toDate;
  }

//  public void set(Game game, LocalDate fromDate, LocalDate toDate, User user) {
//    this.game = game;
//    this.fromDate = fromDate;
//    this.toDate = toDate;
//    this.user = user;
//  }

  /*public User lentTo() {
    return user;
  }*/

  public String lentTo() {
    return borrower;}

//  public Game getGame() {
//    return game;
//  }

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

