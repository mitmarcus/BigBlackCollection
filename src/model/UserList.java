package model;
import java.util.ArrayList;
//mark

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
    public User getUser(User user){
        for (User u : userList) {
            if (u == user) {
                return u;
            }
        }
        return null;
    }
    public User getGuest(User guest)
    {
        for (User u :guestList)
        {
            if (u == guest)
            {
                return u;
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

    public User getUserByFullName(String fullName)
    {
        for (int i = 0; i < userList.size(); i++)
        {
            if (userList.get(i).getFullName().equals(fullName))
                 return userList.get(i);
        }
        return null ;
    }

    public int size() {
        return userList.size();
    }
    public int guestSize()
    {
        return guestList.size();
    }

    public long getUserPhone(User user){
        for (User u : userList) {
            if (u == user) {
                return u.getPhoneNumber();
            }
        }
        return 0;
    }

    public long getUserByPhone(long phoneNumber){
        for (User u : userList) {
            if (u.getPhoneNumber() == phoneNumber) {
                return u.getPhoneNumber();
            }
        }
        return 0;
    }

    public ArrayList<User> getMembersList() {
        ArrayList<User> members = new ArrayList<User>();
        for (User u : userList) {
            if (u.isMember()) {members.add(u);}
            }
        return members;
    }

    public ArrayList<User> getGuestList() {
        ArrayList<User> guests = new ArrayList<>();
        for (User u : userList) {
            if (!u.isMember()) {guests.add(u);}
            }
        return guests;
    }

    public ArrayList<User> getUserlist()
    {
        return userList;
    }

    //TODO: no idea if it works
    public void setUser(User user, User user1)
    {
        for (int i = 0 ; i < userList.size(); i++)
        {
            if (user.equals(userList.get(i)))
            {
                user1 = userList.get(i);
            }
        }
    }
}
