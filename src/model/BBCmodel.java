package model;

import java.util.ArrayList;

public interface BBCmodel
{
  void addUser(User user);
  void removeUser(User user);
  void removeGuest(User guest);
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

  //MEMBERS AND GUESTS CODE

  //CODE FOR GAME

   void addGame (Game game);
   void editGame();
   Game getGame(Game game);
  UserList getParticipantsList();
  int getGameListSize();
  void removeGame(Game game);
  Game getGameByIndex(int index);
  void addParticipant(User user);


  //CODE FOR GAME

  ArrayList<User> getParticipantList();
  User getParticipants(int i);
  void addEvent(Event event);
}
