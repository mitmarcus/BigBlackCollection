package model;
//mark

public class GameReservation {
  private User user;
  private Game game;
  private MyDate fromDate;
  private MyDate toDate;
  public GameReservation(Game game, MyDate fromDate, MyDate toDate, User user) {
    set(game, fromDate, toDate, user);
  }

  public void set(Game game, MyDate fromDate, MyDate toDate, User user) {
    this.game = game;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.user = user;
  }

  public User lentTo() {
    return user;
  }

  public Game getGame() {
    return game;
  }

  public MyDate getFromDate() {
    return fromDate;
  }

  public MyDate getToDate() {
    return toDate;
  }
}
