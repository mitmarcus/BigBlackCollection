package model;

import java.util.ArrayList;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

<<<<<<< Updated upstream
public class BBCmodelManager implements BBCmodel {
  private String userFile;
  private String gameFile;
  private String eventFile;
  private String ReservationFile;
  private String File;

  public BBCmodelManager(String userFile) {
    this.userFile = userFile;
  }


}

  /*public UserList getAllUsers()
=======
public class BBCmodelManager implements BBCmodel
{
  UserList userList;
  UserList guestList;
  private String fileName;

  public BBCmodelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public UserList getAllUsers()
>>>>>>> Stashed changes
  {
    UserList userList = new UserList();

    try
    {
      userList = (UserList) MyFileHandler.readFromBinaryFile(fileName);
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
    return userList;
  }

  @Override public void addUser(User user)
  {
    userList.addUser(user);
  }

  @Override public void removeUser(User user)
  {
    userList.removeUser(user);
  }

  //@Override public void editMember(User user)
  {

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

  @Override public void editUser(User user, User user1)
  {
    userList.setUser(user, user1);
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

  //DummyData for Members List
      /*User Ricardo = new User("Ricardo", "Fernandes", 91757485, true);
      User Jakub = new User("Jacub", "Kuka", 91696968, true);
      User Marcus = new User("Marcus", "Mitela", 91696969, true);
          userList.addUser(Ricardo);
          userList.addUser(Jakub);
          userList.addUser(Marcus);

      //DummyData for Guest list sdasdsadsadasasdadsdas

   User Filip = new User("Filip", "asdadw", 91757485, false);
    User Duarte = new User("Jorge", "Duarte", 91696968, false);
    User Stephen = new User("Stephen", "oasdasi", 91696969, false);
    guestList.addUser(Filip);
    guestList.addUser(Duarte);
    guestList.addUser(Stephen);
}*/
