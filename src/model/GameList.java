package model;
import java.util.ArrayList;


public class GameList
{
  private ArrayList<Game> games;

  public GameList()
  {
    games = new ArrayList<Game>();
  }

  public void addGame(Game game)
  {
    games.add(game);
  }
  public void removeGame(Game game)
  {
    games.remove(game);
  }

  public Game getGameByName(String name)
  {
    for (int i = 0 ; i < games.size(); i ++)
    {
      if (games.get(i).getNameOfGame().equals(name))
        return games.get(i);
    }
    return null;
  }

  public Game getGameByOwner(String owner)
  {
    for (int i = 0 ; i < games.size(); i++)
    {
      if (games.get(i).getOwner().getFirstName()==owner)
      {
        return games.get(i);
      }
    }
    return null;
  }



  public int getGamesListSize()
  {
    return games.size();
  }
  public Game getGame(Game game)
  {
    for (int i = 0; i<games.size(); i++)
    {
      if (games.get(i).equals(game))
      {
        return game;
      }
    }
    return null;
  }
  public Game getGameByIndex(int index)
  {
    return games.get(index);
  }

}
