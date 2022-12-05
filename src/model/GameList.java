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
    addGame(game);
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

}
