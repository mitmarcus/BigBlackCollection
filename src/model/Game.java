package model;

public class Game
{
  private String nameOfGame;
  private int noOfPlayers;
  private User owner;
  private int rating;

  public Game(String nameOfGame, int noOfPlayers , User owner, int rating)
  {
    this.nameOfGame = nameOfGame;
    this.noOfPlayers = noOfPlayers;
    this.owner = owner;
    this.rating = rating;
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
  public void setNoOfPlayers(int noOfPlayers)
  {
    this.noOfPlayers = noOfPlayers;
  }
  public int getRating()
  {
    return rating;
  }
  public void setRatingScore(int rating)
  {
    if (rating > 0 && rating < 6)
    {
      this.rating = rating;
    }
  }


}

