package model;
//mark

import java.time.LocalDate;

public class GameReservation {
  private User user;
  private Game game;
  private LocalDate fromDate;
  private LocalDate toDate;
  public GameReservation(Game game, LocalDate fromDate, LocalDate toDate, User user) {
    set(game, fromDate, toDate, user);
  }

  public void set(Game game, LocalDate fromDate, LocalDate toDate, User user) {
    this.game = game;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.user = user;
  }

  public User getMember() {
    return user;
  }

  public Game getGame() {
    return game;
  }

  public LocalDate getFromDate() {
    return fromDate;
  }

    public LocalDate getToDate() {
    return toDate;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    GameReservation other = (GameReservation) obj;

    return user.equals(other.user) && game.equals(other.game)
            && fromDate.equals(other.fromDate) && toDate.equals(
            other.toDate);
  }

  public String toString()
  {
    return fromDate + " - "+ toDate;
  }
}
