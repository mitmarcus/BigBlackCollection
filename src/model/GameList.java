package model;

import java.util.ArrayList;

/**
 * A class that stores the Game objects into a list
 *
 * @author Marcus Mitelea
 */
public class GameList {
    private ArrayList<Game> games;

    public GameList()
    {
        games = new ArrayList<>();
    }
    public void addGame(Game game)
    {
        games.add(game);
    }
    public void removeGame(Game game)
    {
        games.remove(game);
    }
    public Game getGameByName(String name) {
        for (int i = 0 ; i < games.size(); i ++)
        {
            if (games.get(i).getNameOfGame().equals(name))
                return games.get(i);
        }
        return null;
    }
    public int getGamesListSize()
    {
        return games.size();
    }
    public Game getGameByIndex(int index)
    {
        return games.get(index);
    }
}
