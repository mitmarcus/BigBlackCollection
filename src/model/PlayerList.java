package model;

import java.util.ArrayList;

/**
 * A class that stores the Player objects into a member list and a guest list
 *
 * @author Marcus Mitelea
 */
public class PlayerList {
    private ArrayList<Player> memberList;
    private ArrayList<Player> guestList;

    public PlayerList() {
        memberList = new ArrayList<>();
        guestList = new ArrayList<>();
    }

    public void addUser(Player player) {
        memberList.add(player);
    }
    public  void addGuest(Player guest)
    {
        guestList.add(guest);
    }

    public void removeUser(Player player) {
        memberList.remove(player);
    }
    public void removeGuest(Player guest) {guestList.remove(guest);
    }

    public int size() {
        return memberList.size();
    }
    public int guestSize()
    {
        return guestList.size();
    }

    public Player getUserByPhone(Long phoneNumber)
    {
        for (int i = 0; i< memberList.size(); i++)
        {
            if (memberList.get(i).getPhoneNumber() == phoneNumber)
            {
                return memberList.get(i);
            }
        }
        return null;
    }

    public Player getUserByIndex(int index)
    {
       return memberList.get(index);
    }

    public Player getGuestByIndex(int index)
    {
        return guestList.get(index);
    }

    public Player getGuestByFullName(String fullName)
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

    public Player getUserByFullName(String fullName)
    {
        for (int i = 0; i < memberList.size(); i++)
        {
            if (memberList.get(i).getFullName().equals(fullName))
                 return memberList.get(i);
        }
        return null;
    }
}
