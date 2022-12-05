package model;
//mark

import java.io.Serializable;

public class GameReservation implements Serializable {
  private User user;
  private Game game;
  private Date fromDate;
  private Date toDate;
  public GameReservation(Game game, Date fromDate, Date toDate, User user) {
    set(game, fromDate, toDate, user);
  }

  public void set(Game game, Date fromDate, Date toDate, User user) {
    this.game = game;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.user = user;
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
  public User lentTo() {
    return user;
  }
}
