package model;
//mark

public class GameReservation {
  private Game game;
  private Date fromDate;
  private Date toDate;
  private User user;
  public GameReservation(Game game, Date fromDate, Date toDate, User user) {
    set(game, fromDate, toDate, user);
  }

  public void set(Game game, Date fromDate, Date toDate, User user) {
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

  public Date getFromDate() {
    return fromDate;
  }

  public Date getToDate() {
    return toDate;
  }

  public String toString()
  {
    return fromDate + " - "+toDate;
  }
}
