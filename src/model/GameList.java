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

  public ArrayList<Game> getGamesByOwner(User user)
  {
    ArrayList<Game> gamesByUser = new ArrayList<>();
    for(int i = 0; i<games.size(); i++)
    {
      if(games.get(i).getOwner() == (user))
      {
        gamesByUser.add(games.get(i));
      }
    }
    return gamesByUser;
  }

  public Game getGameByIndex(int index)
  {
    if (index >= 0 && index < games.size())
      return games.get(index);
    else
      return null;
  }

}
