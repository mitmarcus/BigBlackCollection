package model;

/**
 * A class that stores the Game
 *
 * @author Marcus Mitelea
 */
public class Game
{
    private String nameOfGame;
    private int noOfPlayers;
    private Player owner;
    private int rating;

    /**
     * Four-argument constructor initializing the Game
     *
     * @param nameOfGame  the name of the game to initialize
     * @param noOfPlayers  the number of players to initialize
     * @param owner  the owner to initialize
     * @param rating  the rating to initialize
     */
    public Game(String nameOfGame, int noOfPlayers , Player owner, int rating)
    {
        this.nameOfGame = nameOfGame;
        this.noOfPlayers = noOfPlayers;
        this.owner = owner;
        this.rating = rating;
    }

    /**
     * Gets the name of the game from the Game
     *
     * @return the name of the game as a String
     */
    public String getNameOfGame()
    {
        return nameOfGame;
    }

    /**
     * Gets owner of the game from the Game
     *
     * @return owner as a Player
     */
    public Player getOwner()
    {
        return owner;
    }

    /**
     * Gets the number of players from the Game
     *
     * @return the number of players as an int
     */
    public int getNoOfPlayers()
    {
        return noOfPlayers;
    }

    /**
     * Sets the name of the game
     *
     * @param nameOfGame the name of the game to set
     */
    public void setNameOfGame(String nameOfGame)
    {
        this.nameOfGame = nameOfGame;
    }

    /**
     * Sets the number of players
     *
     * @param noOfPlayers the number of players to set
     */
    public void setNoOfPlayers(int noOfPlayers)
    {
        this.noOfPlayers = noOfPlayers;
    }

    /**
     * @return the rating
     */
    public int getRating()
    {
        return rating;
    }

    /**
     * Sets the rating of the game
     * @param rating the rating to set for the game
     */
    public void setRatingScore(int rating)
    {
        if (rating > 0 && rating < 6)
        {
            this.rating = rating;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass()!= obj.getClass())
        {
            return false;
        }
        Game other = (Game)obj;

        return nameOfGame.equals(other.nameOfGame) && rating == other.rating && noOfPlayers == other.noOfPlayers && owner.equals(other.owner);
    }
}

