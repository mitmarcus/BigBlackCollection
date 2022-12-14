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
    int getEventListSize();
    Event getEvent(int i);
    void removeEvent(Event event);
    void addEvent(Event event);

    //GAME METHODS
    void addGame (Game game);
    int getGameListSize();
    void removeGame(Game game);
    Game getGameByIndex(int index);
    Game getGameByName(String name);


    //RESERVATION METHODS
    int getReservationListSize();
    Reservation getReservationByIndex(int i);
    void addReservation(Reservation reservation);
    void removeReservation(Reservation reservation);
}
