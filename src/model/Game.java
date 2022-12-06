package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Game
{
  private String nameOfGame;
  private int maxPlayers;
  private User owner;
  private ArrayList<Integer> gameRating;
  public Game(String nameOfGame, int maxPlayers, User owner)
  {
    this.nameOfGame = nameOfGame;
    this.maxPlayers = maxPlayers;
    this.owner = owner;
    this.gameRating = new ArrayList<Integer>();
  }

  public String getNameOfGame()
  {
    return nameOfGame;
  }
  public User getOwner()
  {
    return owner;
  }
  public int getMaxPlayers()
  {
    return maxPlayers;
  }

  public void setNameOfGame(String nameOfGame)
  {
    this.nameOfGame = nameOfGame;
  }
  public void setOwner(User owner)
  {
    this.owner = owner;
  }
  public void setMaxPlayers(int noOfPlayers)
  {
    this.maxPlayers = noOfPlayers;
  }


  //Rating
  public void addGameRating(int rating)
  {
    this.gameRating.add(rating);
  }
  public String getRating()
  {
    if (gameRating == null)
      return "0";

    int sum = 0;
    for (int i = 0; i < gameRating.size(); i++)
    {
      sum += gameRating.get(i);
    }
    double m = (double) sum / gameRating.size();

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    return String.valueOf(decimalFormat.format(m));
  }


  //misc
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

