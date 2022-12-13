package model;

public interface BBCmodel
{
  void addUser(Player player);
  void removeUser(Player player);
  void removeGuest(Player guest);

  Player getUserByFullName(String fullName);
  Player getGuestByFullName(String fullName);
  Player getUserByPhoneNumber(Long phoneNumber);
  Player getUser(int index);

  Player getGuestByIndex(int index);
  int getUserListSize();
  int getGuestListSize();

  void addGuest(Player guest);
  int getEventListSize();
  Event getEvent(int i);
  void removeEvent(Event event);

  //MEMBERS AND GUESTS CODE

  //CODE FOR GAME

   void addGame (Game game);
  int getGameListSize();
  void removeGame(Game game);
  Game getGameByIndex(int index);
  void addParticipant(Player player);


  void addEvent(Event event);


  //CODE FOR RESERVATION
  int getReservationListSize();
  GameReservation getReservation(int i);
  void addReservation(GameReservation reservation);

  void removeReservation(GameReservation reservation);
  Game getGameByName(String name);
}
