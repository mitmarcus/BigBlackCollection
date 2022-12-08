package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Game
{
  private String nameOfGame;
  private int noOfPlayers;
  private String gameType;

  private User owner;

  private ArrayList<Integer> rating;

  public Game(String nameOfGame, int noOfPlayers , User owner)
  {
    this.nameOfGame = nameOfGame;
    this.noOfPlayers = noOfPlayers;
    rating = new ArrayList<Integer>();
    this.owner = owner;
  }

  public String getNameOfGame()
  {
    return nameOfGame;
  }

  public User getOwner()
  {
    return owner;
  }



  public int getNoOfPlayers()
  {
    return noOfPlayers;
  }



  public void setNameOfGame(String nameOfGame)
  {
    this.nameOfGame = nameOfGame;
  }

  public void setOwner(User owner)
  {
    this.owner = owner;
  }

  public void setNoOfPlayers(int noOfPlayers)
  {
    this.noOfPlayers = noOfPlayers;
  }

  public void addRating(int rating)
  {
    this.rating.add(rating);
  }

  public String getRating()
  {
    if (rating == null)
      return "0";

    int sum = 0;
    for (int i = 0; i < rating.size(); i++)
    {
      sum += rating.get(i);
    }
    double m = (double) sum / rating.size();

    DecimalFormat df = new DecimalFormat("0.00");

    return String.valueOf(df.format(m));
  }



  public boolean gameBelongsToAssociation(Game game)
  {
    if(owner == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }



}

