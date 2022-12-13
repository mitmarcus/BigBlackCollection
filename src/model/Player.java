  package model;

public class Player {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private boolean isMember;

    public Player(String firstName, String lastName, long phoneNumber, boolean isMember) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.isMember = isMember;
    }

    public Player(String firstName, String lastName, long phoneNumber) {
      setFirstName(firstName);
      setLastName(lastName);
      setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
      return firstName + "";
    }

    public String getLastName() {
      return lastName + "";
    }
    public String getFullName()
    {
      return firstName + " " + lastName;
    }

    public long getPhoneNumber()
    {
      return phoneNumber;
    }
    public String getStatus() {
      if(isMember)
      {
        return "Member";
      }
      else {
        return "Guest";
      }
    }
    public void setFirstName(String firstName)
    {
      this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
      this.lastName = lastName;
    }
    public void setFullName(String fullName) {
      this.firstName = fullName.split(" ")[0];
      this.lastName = fullName.split(" ")[1];
    }
    public void setPhoneNumber(long phoneNumber)
    {
      this.phoneNumber = phoneNumber;
    }
    @Override public boolean equals(Object obj) {
      if (obj == null || obj.getClass()!=getClass())
      {
        return false;
      }
      Player other = (Player)obj;
      return firstName.equals(other.firstName) && lastName.equals(other.lastName) && phoneNumber==other.phoneNumber && isMember == other.isMember;
    }
  }
