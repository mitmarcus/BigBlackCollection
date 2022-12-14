package model;

public interface BBCmodel
{
    //MEMBER METHODS
    void addMember(Player player);
    void removeMember(Player player);
    Player getMemberByFullName(String fullName);
    Player getMemberByPhoneNumber(Long phoneNumber);
    Player getMember(int index);
    int getMemberListSize();

    //GUEST METHODS
    void addGuest(Player guest);
    void removeGuest(Player guest);
    Player getGuestByFullName(String fullName);
    Player getGuestByIndex(int index);
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
