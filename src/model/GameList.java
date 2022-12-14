package model;

import java.util.ArrayList;

/**
 * A class that stores the Game objects into a list
 *
 * @author Marcus Mitelea
 */
public class GameList {
    private ArrayList<Game> games;

    /**
     * No-argument constructor initializing the list
     */
    public GameList()
    {
        games = new ArrayList<>();
    }

    /**
     * Adds a Game to the list
     *
     * @param game the Game to add
     */
    public void addGame(Game game)
    {
        games.add(game);
    }

    /**
     * Removes a Game from the list
     *
     * @param game the Game to remove
     */
    public void removeGame(Game game)
    {
        games.remove(game);
    }

    /**
     * Get the Game object from the list using the game name
     *
     * @param name the name of the game
     * @return Game object with the given name
     */
    public Game getGameByName(String name) {
        for (int i = 0 ; i < games.size(); i ++)
        {
            if (games.get(i).getNameOfGame().equals(name))
                return games.get(i);
        }
        return null;
    }

    /**
     * Get the number of games in the list as an integer
     *
     * @return integer representing the number of games in the list
     */
    public int getGamesListSize()
    {
        return games.size();
    }

    /**
     * Get Game object from the list at a specific index
     *
     * @param index the position of the Game object in the list
     * @return Game object at index
     */
    public Game getGameByIndex(int index)
    {
        return games.get(index);
    }
}
