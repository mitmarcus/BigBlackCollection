package model;
import java.io.Serializable;
import java.util.ArrayList;
//mark

public class UserList implements Serializable {
    private ArrayList<User> memberList;
    private ArrayList<User> guestList;

    public UserList() {
        memberList = new ArrayList<User>();
        guestList = new ArrayList<User>();
    }

    public void addMember(User user) {
        memberList.add(user);
    }
    public  void addGuest(User guest)
    {
        guestList.add(guest);
    }

    public void removeUser(User user) {
        memberList.remove(user);
    }
    public void removeGuest(User guest) {guestList.remove(guest);
    }

    public User getUser(User user){
        for (User u : memberList) {
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
       return memberList.get(index);
    }
    public User getGuestByIndex(int index)
    {
        return guestList.get(index);
    }

    public int memberSize() {
        return memberList.size();
    }
    public int guestSize()
    {
        return guestList.size();
    }

    public long getUserPhone(User user){
        for (User u : memberList) {
            if (u == user) {
                return u.getPhoneNumber();
            }
        }
        return 0;
    }
    public long getUserByPhone(long phoneNumber){
        for (User u : memberList) {
            if (u.getPhoneNumber() == phoneNumber) {
                return u.getPhoneNumber();
            }
        }
        return 0;
    }

    public ArrayList<User> getMembersList() {
        ArrayList<User> members = new ArrayList<>();
        for (User u : memberList) {
            if (u.isMember()) {members.add(u);}
            }
        return members;
    }
    public ArrayList<User> getGuestList() {
        ArrayList<User> guests = new ArrayList<>();
        for (User u : memberList) {
            if (!u.isMember()) {guests.add(u);}
            }
        return guests;
    }

    // ??? shouldnt this be it??
    public ArrayList<User> getUserList()
    {
        return memberList;
    }
    public ArrayList<User> getGuestsList()
    {
        return guestList;
    }

    //TODO: no idea if it works
    /*public void setUser(User user, User user1)
    {
        for (int i = 0 ; i < userList.size(); i++)
        {
            if (user.equals(userList.get(i)))
            {
                user1 = userList.get(i);
            }
        }*/
    }
