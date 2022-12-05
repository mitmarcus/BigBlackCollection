package model;

import java.io.Serializable;

public class Game implements Serializable
{
  private String nameOfGame;
  private int noOfPlayers;
  private String gameType;
  private GameRating gameRating;
  private User owner;

  public Game(String nameOfGame, int noOfPlayers, GameRating gameRating, User owner)
  {
    this.nameOfGame = nameOfGame;
    this.noOfPlayers = noOfPlayers;
    this.gameRating = gameRating;
    this.owner = owner;
  }

  public String getNameOfGame()
  {
    return nameOfGame;
  }
  public GameRating getGameRating()
  {
    return gameRating;
  }
  public User getOwner()
  {
    return owner;
  }
  public int getNoOfPlayers()
  {
    return noOfPlayers;
  }


  public void setGameRating(GameRating gameRating)
  {
    this.gameRating = gameRating;
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

  public String getGameType()
  {
    return gameType;
  }

  public void setGameType(String gameType)
  {
    this.gameType = gameType;
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

  public void setGameRating()
  {
      this.gameRating = gameRating;
  }
}

