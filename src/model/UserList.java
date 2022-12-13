package model;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> userList;
    private ArrayList<User> guestList;

    public UserList() {
        userList = new ArrayList<User>();
        guestList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }
    public  void addGuest(User guest)
    {
        guestList.add(guest);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }
    public void removeGuest(User guest) {guestList.remove(guest);
    }
    
    public int size() {
        return userList.size();
    }
    public int guestSize()
    {
        return guestList.size();
    }

    public User getUserByPhone(Long phoneNumber)
    {
        for ( int i = 0 ; i< userList.size(); i++)
        {
            if (userList.get(i).getPhoneNumber() == phoneNumber)
            {
                return userList.get(i);
            }
        }
        return null;
    }

    public User getUserByIndex(int index)
    {
       return userList.get(index);
    }

    public User getGuestByIndex(int index)
    {
        return guestList.get(index);
    }

    public User getGuestByFullName(String fullName)
    {
        for (int i = 0 ; i< guestList.size(); i++)
        {
            if (guestList.get(i).getFullName().equals(fullName))
            {
                return guestList.get(i);
            }
        }
        return null;
    }

    public User getUserByFullName(String fullName)
    {
        for (int i = 0; i < userList.size(); i++)
        {
            if (userList.get(i).getFullName().equals(fullName))
                 return userList.get(i);
        }
        return null ;
    }
}
