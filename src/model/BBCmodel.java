package model;

import java.util.ArrayList;

public interface BBCmodel
{
  void addUser(User user);
  void removeUser(User user);
  User getUser(User user);
  User getUser(int index);
  User getGuest(User guest);
  User getGuestByIndex(int index);
  void editUser(User user, User user1);
  int getUserListSize();
  int getGuestListSize();
  ArrayList<User> getMemberList();
  ArrayList<User> getGuestList();
  void addGuest(User guest);


  //MEMBERS AND GUESTS CODE



}
