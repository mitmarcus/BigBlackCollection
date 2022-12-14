package model;

/**
 * A class that stores the Player
 *
 * @author Marcus Mitelea
 */
public class Player {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private boolean isMember;


    /**
     * Four-argument constructor initializing the Player
     *
     * @param firstName  the first name to initialize
     * @param lastName  the last name to initialize
     * @param phoneNumber  the phone number to initialize
     * @param isMember  the member status to initialize
     */
    public Player(String firstName, String lastName, long phoneNumber, boolean isMember) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.isMember = isMember;
    }

    /**
     * Gets the first name from the Player
     *
     * @return the first name as a String
     */
    public String getFirstName() {
      return firstName + "";
    }

    /**
     * Gets the last name from the Player
     *
     * @return the last name as a String
     */
    public String getLastName() {
      return lastName + "";
    }

    /**
     * Gets the full name from the Player
     *
     * @return the full name as a String
     */
    public String getFullName()
    {
      return firstName + " " + lastName;
    }

    /**
     * Gets the phone number from the Player
     *
     * @return the phone number as a long
     */
    public long getPhoneNumber()
    {
      return phoneNumber;
    }

    /**
     * Gets the member status from the Player
     *
     * @return the member status as a String
     */
    public String getStatus() {
      if(isMember)
      {
        return "Member";
      }
      else {
        return "Guest";
      }
    }

    /**
     * Sets the first and last name of the Player using the full name
     *
     * @param fullName the full name to set
     */
    public void setFullName(String fullName) {
      this.firstName = fullName.split(" ")[0];
      this.lastName = fullName.split(" ")[1];
    }

    /**
     * Sets the phone number from the Player
     *
     * @param phoneNumber the phone number to set
     */
    public void setPhoneNumber(long phoneNumber)
    {
      this.phoneNumber = phoneNumber;
    }

    /**
     * Checks if the Player is the same as the other Object
     *
     * @param obj the Object to check with
     * @return true if the Object obj is the same as the Player, else false
     */
    @Override public boolean equals(Object obj) {
      if (obj == null || obj.getClass()!=getClass())
      {
        return false;
      }
      Player other = (Player)obj;
      return firstName.equals(other.firstName) && lastName.equals(other.lastName) && phoneNumber==other.phoneNumber && isMember == other.isMember;
    }
  }
