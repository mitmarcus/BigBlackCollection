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

    /**
     * No-argument constructor initializing the lists
     */
    public PlayerList() {
        memberList = new ArrayList<>();
        guestList = new ArrayList<>();
    }

    /**
     * Adds a Player to the member list
     *
     * @param player the Player to add
     */
    public void addMember(Player player) {
        memberList.add(player);
    }

    /**
     * Adds a Player to the guest list
     *
     * @param guest the Player to add
     */
    public void addGuest(Player guest)
    {
        guestList.add(guest);
    }

    /**
     * Removes a Player from the member list
     *
     * @param player the Player to remove
     */
    public void removeMember(Player player) {
        memberList.remove(player);
    }

    /**
     * Removes a Player from the guest list
     *
     * @param guest the Player to remove
     */
    public void removeGuest(Player guest) {guestList.remove(guest);
    }

    /**
     * Get the number of members in the list as an integer
     *
     * @return integer representing the number of members in the list
     */
    public int memberSize() {
        return memberList.size();
    }

    /**
     * Get the number of guests in the list as an integer
     *
     * @return integer representing the number of guests in the list
     */
    public int guestSize()
    {
        return guestList.size();
    }

    /**
     * Get Player object from the member list using the player's phone number
     *
     * @return Player object with the specified phone number
     */
    public Player getMemberByPhone(Long phoneNumber)
    {
        // loops through the member list and returns the player with the specified phone number
        for (int i = 0; i< memberList.size(); i++) // n operations
        {
            // checks if the phone number of the player at index i is equal to the specified phone number
            if (memberList.get(i).getPhoneNumber() == phoneNumber) // 1 operation
            {
                // returns the player at index i
                return memberList.get(i); // 1 operation
            }
        }
        return null; // 1 operation
    }
    // T(n): 3n + 2 total operations
    // Big O: O(n)


    /**
     * Get Player object from the member list at a specific index
     *
     * @param index the index of the Player object in the list
     * @return Player object at index
     */
    public Player getMembersByIndex(int index)
    {
       return memberList.get(index);
    }

    /**
     * Get Player object from the guest list at a specific index
     *
     * @return Player object at index
     */
    public Player getGuestByIndex(int index)
    {
        return guestList.get(index);
    }

    /**
     * Get Player object from the guest list using the player's full name
     *
     * @param fullName the full name of the Player object
     * @return Player object with the specified full name
     */
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

    /**
     * Get Player object from the member list using the player's full name
     *
     * @param fullName the full name of the Player object
     * @return Player object with the specified full name
     */
    public Player getMemberByFullName(String fullName)
    {
        for (int i = 0; i < memberList.size(); i++)
        {
            if (memberList.get(i).getFullName().equals(fullName))
                 return memberList.get(i);
        }
        return null;
    }
}
