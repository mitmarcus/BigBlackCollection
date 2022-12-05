package model;
import java.io.Serializable;


public class GameRating implements Serializable
{
  private int rating;
  private int noOfPeopleRated;

  public GameRating()
  {
    this.rating = 0;
    this.noOfPeopleRated = 0;
  }
  public void addRating(int rating)
  {
    if(rating > 0 && rating <=5){ this.rating += rating; noOfPeopleRated++; }
  }

  public double getRatingAverage()
  {
    return (double)rating/noOfPeopleRated;
  }

}

