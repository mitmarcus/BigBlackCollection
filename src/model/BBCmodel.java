package model;

public interface BBCmodel
{
  //User
  UserList getUsers();
  void saveUsers(UserList members);
  void addUser(User user);
  void removeUser(User user);


  //Game
  GameList getAllGames();
  void saveGames(GameList games);
  void addGame (Game game);
  void removeGame(Game game);

  //Event
  EventList getEvents();
  void saveEvents(EventList events);
  void addEvent(Event event);
  void removeEvent(Event event);
  int getEventListSize();
  //XML
  void saveToXML(String fileName, String data);

  Event getEvent(int i);
  void addGuest(User user);
  int getGameListSize();
  Game getGameByIndex(int i);
}
