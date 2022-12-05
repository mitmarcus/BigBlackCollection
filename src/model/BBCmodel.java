package model;

import java.util.ArrayList;

public interface BBCmodel
{
  //MEMBERS AND GUESTS CODE
  void addUser(User user);
  void removeUser(User user);
  void editMember(User user, User user1);
  User getUser(User user);
  User getUser(int index);
  User getGuest(User guest);
  User getGuestByIndex(int index);
  int getUserListSize();
  int getGuestListSize();
  ArrayList<User> getMemberList();
  ArrayList<User> getGuestList();
  void addGuest(User guest);
  int getEventListSize();
  Event getEvent(int i);
  void removeEvent(Event event);

  //CODE FOR GAME
  void addGame (Game game);
  void editGame();
  Game getGame(Game game);
  int getGameListSize();
  void removeGame(Game game);
  Game getGameByIndex(int index);

  //CODE FOR EVENT






}
