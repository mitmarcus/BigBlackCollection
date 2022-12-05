package model;
import java.io.Serializable;
import java.util.ArrayList;


public class GameList implements Serializable
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
    removeGame(game);
  }
  public ArrayList<Game> getGamesByOwner(User user)
  {
    ArrayList<Game> gamesByUser = new ArrayList<Game>();
    for(int i = 0; i<games.size(); i++)
    {
      if(games.get(i).getOwner() == (user))
      {
        gamesByUser.add(games.get(i));
      }
    }
    return gamesByUser;
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
