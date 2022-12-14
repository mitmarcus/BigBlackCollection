package model;

import java.time.LocalDate;

/**
 * A class that implements the BBCmodelManager interface and manages the model
 *
 * @author Marcus Mitelea
 */
public class BBCmodelManager implements BBCmodel
{
    private PlayerList memberList; //MEMBERS LIST
    private PlayerList guestList; //GUEST LIST
    private GameList gameList; //GAME LIST
    private EventList eventList; //EVENT LIST
    private ReservationList reservationList; //RESERVATION LIST

    /**
     * No-argument constructor initializing the lists and adding the default members
     */
    public BBCmodelManager()
    {
        memberList = new PlayerList();
        guestList = new PlayerList();
        gameList = new GameList();
        reservationList = new ReservationList();
        eventList = new EventList();
        createDummyData();
    }

    /**
     * Creates the default members
     */
    public void createDummyData()
    {
        //DummyData for Members List
        Player Ricardo = new Player("Ricardo", "Fernandes", 91757485, true);
        Player Jakub = new Player("Jakub", "Kuka", 91696968, true);
        memberList.addMember(Ricardo);
        memberList.addMember(Jakub);
        memberList.addMember(new Player("Marcus", "Mitelea", 91696969, true));

        //DummyData for Guest list
        guestList.addGuest(new Player("Filip", "asdadw", 91757485, false));
        guestList.addGuest(new Player("Jorge", "Duarte", 91696968, false));
        guestList.addGuest(new Player("Steffan", "JavaMaster", 91696969, false));

        //DummyData for Events
        eventList.addEvent(new Event("Chess Tournament", "VIA", "Tournament only Available for members" , LocalDate.parse("2022-12-26")));
        eventList.addEvent(new Event("Checkers Tournament", "VIA", "Tournament only Available for members" , LocalDate.parse("2022-12-28")));

        //DummyData for Games
        gameList.addGame(new Game("Checkers", 2, Ricardo,0));
        gameList.addGame(new Game ("Chess", 2, Jakub,1));

        //DummyData for Reservations
        reservationList.addReservation(new Reservation("Ricardo", "Checkers",LocalDate.parse("2022-12-26") , LocalDate.parse("2022-12-28")));
        reservationList.addReservation(new Reservation("Marcus", "Chess", LocalDate.parse("2022-12-26"), LocalDate.parse("2022-12-30")));
    }

    //MEMBER METHODS
    /**
     * Adds a Player to the member list
     *
     * @param player the Player to add
     */
    public void addMember(Player player) {
        memberList.addMember(player);
    }

    /**
     * Removes a Player from the member list
     *
     * @param player the Player to remove
     */
    public void removeMember(Player player) {
        memberList.removeMember(player);
    }

    /**
     * Get Player object from the member list using the player's full name
     *
     * @param fullName the full name of the Player
     * @return Player object with the specified full name
     */
    public Player getMemberByFullName(String fullName) {
        return memberList.getMemberByFullName(fullName);
    }

    /**
     * Get Player object from the member list using the player's phone number
     *
     * @param phoneNumber the phone number of the Player
     * @return Player object with the specified phone number
     */
    public Player getMemberByPhoneNumber(Long phoneNumber) {
        return memberList.getMemberByPhone(phoneNumber);
    }

    /**
     * Get Player object from the member list at a specific index
     *
     * @param index the index of the Player object
     * @return Player object at index
     */
    public Player getMemberByIndex(int index) {
        return memberList.getMembersByIndex(index);
    }

    /**
     * Get the number of members in the list as an integer
     *
     * @return the number of members in the list
     */
    public int getMemberListSize() {
        return memberList.memberSize();
    }

    //GUEST METHODS
    /**
     * Adds a Player to the guest list
     *
     * @param guest the Player to add
     */
    public void addGuest(Player guest) {
        guestList.addGuest(guest);
    }

    /**
     * Removes a Player from the guest list
     *
     * @param guest the Player to remove
     */
    public void removeGuest(Player guest){
        guestList.removeGuest(guest);
    }

    /**
     * Get Player object from the guest list using the player's full name
     *
     * @return Player object with the specified full name
     */
    public Player getGuestByFullName(String fullName) {
        return guestList.getGuestByFullName(fullName);
    }

    /**
     * Get Player object from the guest list using the player's phone number
     *
     * @param index the index of the Player to get
     * @return Player object with the specified phone number
     */
    public Player getGuestByIndex(int index) {
        return guestList.getGuestByIndex(index);
    }

    /**
     * Get Player object from the guest list at a specific index
     *
     * @return Player object at index
     */
    public int getGuestListSize() {
        return guestList.guestSize();
    }

    //EVENT METHODS
    /**
     * Gets the number of events in the list
     *
     * @return the number of events in the list as an integer
     */
    public int getEventListSize() {
        return eventList.getEventListSize();
    }

    /**
     * Gets an Event object from position index from the list
     *
     * @param index the position of the Event object in the list
     * @return the Event at index if one exists, else null
     */
    public Event getEventByIndex(int index) {
        return eventList.getEventByIndex(index);
    }

    /**
     * Adds an Event to the event list
     *
     * @param event the Event to add
     */
    public void addEvent(Event event) {
        eventList.addEvent(event);
    }

    /**
     * Removes an Event from the event list
     *
     * @param event the Event to remove
     */
    public void removeEvent(Event event) {
        eventList.removeEvent(event);
    }


    //RESERVATION METHODS
    /**
     * Get the number of reservations in the list as an integer
     *
     * @return integer representing the number of reservations in the list
     */
    public int getReservationListSize() {
        return reservationList.getReservationListSize();
    }

    /**
     * Get Reservation object from the list at a specific index
     *
     * @param index the index of the Reservation object
     * @return Reservation object at index
     */
    public Reservation getReservationByIndex(int index) {
        return reservationList.getReservationByIndex(index);
    }

    /**
     * Adds a Reservation to the list
     *
     * @param reservation the Reservation to add
     */
    public void addReservation(Reservation reservation) {
        reservationList.addReservation(reservation);
    }

    /**
     * Removes a Reservation from the list
     *
     * @param reservation the Reservation to remove
     */
    public void removeReservation(Reservation reservation) {
        reservationList.removeReservation(reservation);
    }


    //GAMES CODE
    /**
     * Adds a Game to the list
     *
     * @param game the Game to add
     */
    public void addGame(Game game) {
        gameList.addGame(game);
    }

    /**
     * Get the Game object from the list using the game name
     *
     * @param name the name of the Game
     * @return Game object with the given name
     */
    public Game getGameByName(String name) {
        return gameList.getGameByName(name);
    }

    /**
     * Get Game object from the list at a specific index
     *
     * @param index the position of the Game object in the list
     * @return Game object at index
     */
    public Game getGameByIndex(int index) {
        return gameList.getGameByIndex(index);
    }

    /**
     * Get the number of games in the list as an integer
     *
     * @return integer representing the number of games in the list
     */
    public int getGameListSize() {
        return gameList.getGamesListSize();
    }

    /**
     * Removes a Game from the list
     *
     * @param game the Game to remove
     */
    public void removeGame(Game game) {
        gameList.removeGame(game);
    }
    
}
