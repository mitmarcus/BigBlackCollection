package model;

public interface BBCmodel
{
  void addUser(User user);
  void removeUser(User user);
  void removeGuest(User guest);

  User getUserByFullName(String fullName);
  User getGuestByFullName(String fullName);
  User getUserByPhoneNumber(Long phoneNumber);
  User getUser(int index);

  User getGuestByIndex(int index);
  int getUserListSize();
  int getGuestListSize();

  void addGuest(User guest);
  int getEventListSize();
  Event getEvent(int i);
  void removeEvent(Event event);

  //MEMBERS AND GUESTS CODE

  //CODE FOR GAME

   void addGame (Game game);
  int getGameListSize();
  void removeGame(Game game);
  Game getGameByIndex(int index);
  void addParticipant(User user);


  void addEvent(Event event);


  //CODE FOR RESERVATION
  int getReservationListSize();
  GameReservation getReservation(int i);
  void addReservation(GameReservation reservation);

  void removeReservation(GameReservation reservation);
  Game getGameByName(String name);
}
