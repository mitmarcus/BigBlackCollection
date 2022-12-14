package model;

/**
 * A java Interface class that has the following methods.
 *
 * @author Marcus Mitelea
 */
public interface BBCmodel
{
    //MEMBER METHODS
    /**
     * Adds a Player to the member list
     *
     * @param player the Player to add
     */
    void addMember(Player player);

    /**
     * Removes a Player from the member list
     *
     * @param player the Player to remove
     */
    void removeMember(Player player);

    /**
     * Get Player object from the member list using the player's full name
     *
     * @param fullName the full name of the Player
     * @return Player object with the specified full name
     */
    Player getMemberByFullName(String fullName);

    /**
     * Get Player object from the member list using the player's phone number
     *
     * @param phoneNumber the phone number of the Player
     * @return Player object with the specified phone number
     */
    Player getMemberByPhoneNumber(Long phoneNumber);

    /**
     * Get Player object from the member list at a specific index
     *
     * @param index the index of the Player object
     * @return Player object at index
     */
    Player getMemberByIndex(int index);

    /**
     * Get the number of members in the list as an integer
     *
     * @return the number of members in the list
     */
    int getMemberListSize();

    //GUEST METHODS
    /**
     * Adds a Player to the guest list
     *
     * @param guest the Player to add
     */
    void addGuest(Player guest);

    /**
     * Removes a Player from the guest list
     *
     * @param guest the Player to remove
     */
    void removeGuest(Player guest);

    /**
     * Get Player object from the guest list using the player's full name
     *
     * @return Player object with the specified full name
     */
    Player getGuestByFullName(String fullName);

    /**
     * Get Player object from the guest list using the player's phone number
     *
     * @param index the index of the Player to get
     * @return Player object with the specified phone number
     */
    Player getGuestByIndex(int index);

    /**
     * Get Player object from the guest list at a specific index
     *
     * @return Player object at index
     */
    int getGuestListSize();

    //EVENT METHODS
    /**
     * Gets the number of events in the list
     *
     * @return the number of events in the list as an integer
     */
    int getEventListSize();

    /**
     * Gets an Event object from position index from the list
     *
     * @param index the position of the Event object in the list
     * @return the Event at index if one exists, else null
     */
    Event getEventByIndex(int index);

    /**
     * Adds an Event to the event list
     *
     * @param event the Event to add
     */
    void addEvent(Event event);

    /**
     * Removes an Event from the event list
     *
     * @param event the Event to remove
     */
    void removeEvent(Event event);

    //RESERVATION METHODS
    /**
     * Get the number of reservations in the list as an integer
     *
     * @return integer representing the number of reservations in the list
     */
    int getReservationListSize();

    /**
     * Get Reservation object from the list at a specific index
     *
     * @param index the index of the Reservation object
     * @return Reservation object at index
     */
    Reservation getReservationByIndex(int index);

    /**
     * Adds a Reservation to the list
     *
     * @param reservation the Reservation to add
     */
    void addReservation(Reservation reservation);

    /**
     * Removes a Reservation from the list
     *
     * @param reservation the Reservation to remove
     */
    void removeReservation(Reservation reservation);


    //GAME METHODS
    /**
     * Adds a Game to the list
     *
     * @param game the Game to add
     */
    void addGame (Game game);

    /**
     * Get the number of games in the list as an integer
     *
     * @return integer representing the number of games in the list
     */
    int getGameListSize();

    /**
     * Removes a Game from the list
     *
     * @param game the Game to remove
     */
    void removeGame(Game game);

    /**
     * Get Game object from the list at a specific index
     *
     * @param index the position of the Game object in the list
     * @return Game object at index
     */
    Game getGameByIndex(int index);

    /**
     * Get the Game object from the list using the game name
     *
     * @param name the name of the Game
     * @return Game object with the given name
     */
    Game getGameByName(String name);

}
