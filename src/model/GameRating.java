package model;
import java.io.Serializable;
import java.util.ArrayList;

public class GameRating implements Serializable
{
  private int rating;
  private int noOfPeople;

  public GameRating(int rating, int noOfPeople)
  {
    this.rating = 0;
    this.noOfPeople = noOfPeople;
  }
  public void addRating(int rating)
  {
    if(rating > 0 && rating <=5){
    this.rating += rating;
    noOfPeople++;}
  }

  public double getRatingAverage()
  {
    return (double)rating/noOfPeople;
  }

}

