package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BBCmodelManager implements BBCmodel
{
  private UserList userList; //MEMBERS LIST
  private UserList guestList; //GUEST LIST

  private GameList gameList; //GAME LIST

  private EventList eventList;
  private UserList participantsList;

  public BBCmodelManager()
  {
    userList = new UserList();
    guestList = new UserList();
    gameList = new GameList();
    eventList = new EventList();
    participantsList = new UserList();

    createDummyData();
  }
  public void createDummyData()
  {

      //DummyData for Members List
      User Ricardo = new User("Ricardo", "Fernandes", 91757485, true);
      User Jakub = new User("Jacub", "Kuka", 91696968, true);
      User Marcus = new User("Marcus", "Mitela", 91696969, true);
          userList.addUser(Ricardo);
          userList.addUser(Jakub);
          userList.addUser(Marcus);

      //DummyData for Guest list sdasdsadsadasasdadsdas

   /* User Filip = new User("Filip", "asdadw", 91757485, false);
    User Duarte = new User("Jorge", "Duarte", 91696968, false);
    User Stephen = new User("Stephen", "oasdasi", 91696969, false);
    guestList.addUser(Filip);
    guestList.addUser(Duarte);
    guestList.addUser(Stephen);*/


    Event e1 = new Event("Drena", "VIA", "dfodsngsodnsdodu" ,null);
    Event e2 = new Event("Ddana", "Vsd", "dsdadu" , null);
    eventList.addEvent(e1);
    eventList.addEvent(e2);





  }
  @Override public void addUser(User user)
  {
    userList.addUser(user);
  }

  @Override public void removeUser(User user)
  {
    userList.removeUser(user);
  }

  @Override public void editMember(User user, User user1)
  {
    userList.setUser(user, user1);
  }

  @Override public User getUser(User user)
  {
    for (User user1 : userList.getUserlist())
    {
      if (user1.equals(user))
      {
        return user;
      }
    }
    return null;
  }
  @Override public User getUser(int index)
  {
    return userList.getUserByIndex(index);
  }
  @Override public User getGuest(User guest)
  {
   return guestList.getGuest(guest);
  }
  @Override public User getGuestByIndex(int index)
  {
    return guestList.getGuestByIndex(index);
  }


  @Override public int getUserListSize()
  {
    return userList.size();
  }
  @Override public int getGuestListSize()
  {
    return guestList.size();
  }


  @Override public ArrayList<User> getMemberList()
  {
    return userList.getMembersList();
  }

  @Override public ArrayList<User> getGuestList()
  {
    return null;
  }



  @Override public void addGuest(User guest)
  {
    guestList.addGuest(guest);
  }

  @Override public int getEventListSize()
  {
    return eventList.getEventListSize();
  }

  @Override public Event getEvent(int index)
  {
    return eventList.getEventByIndex(index);
  }

  @Override public void removeEvent(Event event)
  {
    eventList.removeEvent(event);
  }
  @Override public void addEvent(Event event)
  {
    eventList.addEvent(event);
  }

  //MEMBERS AND GUEST CODE


  //GAMES CODE

  @Override public void addGame(Game game)
  {
    gameList.addGame(game);
  }

  @Override public void editGame()
  {

  }

  @Override public Game getGame(Game game)
  {
    return gameList.getGame(game);
  }

  @Override public Game getGameByIndex(int index)
  {
    return gameList.getGameByIndex(index);
  }

  @Override public void addParticipant(User user)
  {

  }

  @Override public ArrayList<User> getParticipantList()
  {
    return null;
  }

  @Override public User getParticipants(int i)
  {
    return null;
  }



  @Override public UserList getParticipantsList()
  {
    return participantsList;
  }

  @Override public int getGameListSize()
  {
    return gameList.getGamesListSize();
  }

  @Override public void removeGame(Game game)
  {
    gameList.removeGame(game);
  }






}
