package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BBCmodelManager implements BBCmodel
{
  private UserList userList; //MEMBERS LIST
  private UserList guestList; //GUEST LIST

  private GameList gameList; //GAME LIST

  private EventList eventList;
  private GameReservationList reservationList;
  private UserList participantsList;

  public BBCmodelManager()
  {
    userList = new UserList();
    guestList = new UserList();
    gameList = new GameList();
    reservationList = new GameReservationList();
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

      //DummyData for Guest list

    User Filip = new User("Filip", "asdadw", 91757485, false);
    User Duarte = new User("Jorge", "Duarte", 91696968, false);
    User Stephen = new User("Stephen", "oasdasi", 91696969, false);
    guestList.addGuest(Filip);
    guestList.addGuest(Duarte);
    guestList.addGuest(Stephen);



      //DummyData for Events
    LocalDate date11 =  LocalDate.parse("2022-12-26");
    LocalDate date22 =  LocalDate.parse("2022-12-28");
    LocalDate date33 =  LocalDate.parse("2022-12-30");

    Event e1 = new Event("Chess Tournament", "VIA", "Tournament only Available for members" ,date11);
    Event e2 = new Event("Checkers Tournament", "VIA", "Tournament only Available for members" , date22);
    eventList.addEvent(e1);
    eventList.addEvent(e2);

    //DummyData for Games

    Game g = new Game("Checkers", 2, Ricardo,0  );
    Game h = new Game ("Chess", 2, Jakub,1);
    gameList.addGame(g);
    gameList.addGame(h);



    //DummyData for GameReservations
    LocalDate date1 =  LocalDate.parse("2022-12-26");
    LocalDate date2 =  LocalDate.parse("2022-12-28");
    LocalDate date3 =  LocalDate.parse("2022-12-30");

    GameReservation game = new GameReservation("Ricardo", "Checkers",date1 , date2);
    GameReservation game1 = new GameReservation("Marcus", "Chess", date1, date3);
    reservationList.addReservation(game);
    reservationList.addReservation(game1);

    //System.out.println(game);






    //MEMBERS AND GUEST CODE

  }
  @Override public void addUser(User user)
  {
    userList.addUser(user);
  }
  @Override public void addGuest(User guest)
  {
    guestList.addGuest(guest);
  }

  @Override public void removeUser(User user)
  {
    userList.removeUser(user);
  }

  @Override public void removeGuest(User guest){guestList.removeGuest(guest);}

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

  @Override public User getUserByFullName(String fullName)
  {
    return userList.getUserByFullName(fullName);
  }

  @Override public User getGuestByFullName(String fullName)
  {
    return guestList.getGuestByFullName(fullName);
  }

  @Override public User getUserByPhoneNumber(Long phoneNumber)
  {
    return userList.getUserByPhone(phoneNumber);
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
    return guestList.guestSize();
  }


  @Override public ArrayList<User> getMemberList()
  {
    return userList.getMembersList();
  }

  @Override public ArrayList<User> getGuestList()
  {
    return null;
  }



//Event Code

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



  //Reservation code

  @Override
  public int getReservationListSize() {
    return reservationList.getReservationListSize();
  }

  @Override
  public GameReservation getReservation(int index) {
    return reservationList.getReservationByIndex(index);
  }

  @Override
  public void addReservation(GameReservation reservation) {
    reservationList.addReservation(reservation);
  }


  @Override public void removeReservation(GameReservation reservation)
  {
    reservationList.removeReservation(reservation);
  }





  //GAMES CODE

  @Override public void addGame(Game game)
  {
    gameList.addGame(game);
  }

  @Override public void editGame()
  {

  }

  @Override public Game getGameByName(String name)
  {
    return gameList.getGameByName(name);
  }

  @Override public Game getGameByOwner(String owner)
  {
    return gameList.getGameByOwner(owner);
  }

  @Override public Game getGame(Game game)
  {
    return gameList.getGame(game);
  }

  @Override public Game getGameByIndex(int index)
  {
    return gameList.getGameByIndex(index);
  }

  @Override public int getGameListSize()
  {
    return gameList.getGamesListSize();
  }

  @Override public void removeGame(Game game)
  {
    gameList.removeGame(game);
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








}
