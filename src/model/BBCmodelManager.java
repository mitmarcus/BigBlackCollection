package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BBCmodelManager implements BBCmodel
{
  private String userFile; //MEMBERS
  private String eventFile; //EVENTS
  private String gameFile; //GAMES
  private String reservationFile; //RESERVATIONS


  public BBCmodelManager()
  {
   /* this.userFile = membersFile;
    this.gameFile = gamesFile; */
    this.eventFile = eventFile;
    this.reservationFile = reservationFile;
  }



  //USERS
  public UserList getUsers()
  {
    UserList allUsers = new UserList();

    try
    {
      allUsers = (UserList) MyFileHandler.readFromBinaryFile(userFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allUsers;
  }
  public void saveUsers(UserList members)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(userFile, members);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
  public void addUser(User user)
  {
    UserList allMembers = getUsers();

    allMembers.addUser(user);
    saveUsers(allMembers);
  }
  public void removeUser(User user)
  {
    UserList allMembers = getUsers();

    allMembers.removeUser(user);
    saveUsers(allMembers);
  }


  //GAMES
  public GameList getAllGames()
  {
    GameList allGames = new GameList();

    try
    {
      allGames = (GameList) MyFileHandler.readFromBinaryFile(gameFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allGames;
  }
  public void saveGames(GameList games)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(gameFile, games);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
  public void addGame(Game game)
  {
    GameList allGames = getAllGames();

    allGames.addGame(game);
    saveGames(allGames);
  }
  public void removeGame(Game game)
  {
    GameList allGames = getAllGames();

    allGames.removeGame(game);
    saveGames(allGames);
  }


  //EVENTS
  public EventList getEvents()
  {
    EventList allEvents = new EventList();

    try
    {
      allEvents = (EventList) MyFileHandler.readFromBinaryFile(eventFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allEvents;
  }
  public void saveEvents(EventList events)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(eventFile, events);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
  public void addEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.addEvent(event);
    saveEvents(allEvents);
  }
  public void removeEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.removeEvent(event);
    saveEvents(allEvents);
  }

  @Override public int getEventListSize()
  {
    return 0;
  }

  public GameReservationList getReservations()
  {
    GameReservationList allReservations = new GameReservationList();

    try
    {
      allReservations = (GameReservationList) MyFileHandler.readFromBinaryFile(reservationFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allReservations;
  }

  public void saveReservations(GameReservationList reservations)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(reservationFile, reservations);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  public void addGameReservation(GameReservation reservation)
  {
    GameReservationList allReservations = getReservations();

    allReservations.addGameReservation(reservation);
    saveReservations(allReservations);
  }

  public void removeGameReservation(GameReservation reservation)
  {
    GameReservationList allReservations = getReservations();

    allReservations.removeGameReservation(reservation);
    saveReservations(allReservations);
  }

  //XML
  @Override
  public void saveToXML(String fileName, String data) {
    try
    {
      MyFileHandler.writeToTextFile(fileName,data);
    }
    catch (FileNotFoundException error)
    {
      System.out.println("Can't save XML File, "+error.getMessage());
    }
  }

  @Override public Event getEvent(int i)
  {
    for(int i = 0; i< getEventListSize(); i++)
    {
      if(getEvents(i) ==)
    }
  }

  @Override public void addGuest(User user)
  {

  }


}

