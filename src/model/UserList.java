package model;
import java.util.ArrayList;
//mark

public class UserList {
    private ArrayList<User> userList;

    public UserList() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User getUser(User user){
        for (User u : userList) {
            if (u == user) {
                return u;
            }
        }
        return null;
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
