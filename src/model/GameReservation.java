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

  public User getMember() {
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
