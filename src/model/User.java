package model;

public class User {

  private boolean isMember;
  private String firstName;
  private String lastName;
  private long phoneNumber;


  public User(String firstName, String lastName, long phoneNumber, boolean isMember)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.isMember = isMember;
  }

  public User(String firstName, String lastName, long phoneNumber)
  {
    setFirstName(firstName);
    setLastName(lastName);
    setPhoneNumber(phoneNumber);
  }

  public String getFirstName()
  {
    String first = getFullName().split(" ")[0];
    return first;
  }

  public String getLastName()
  {
    String last = getFullName().split(" ")[1];
    return last;
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public long getPhoneNumber()
  {
    return phoneNumber;
  }

  public boolean isMember()
  {
    return isMember;
  }

  public String getStatus()
  {
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

  public void setPhoneNumber(long phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass()!=getClass())
    {
      return false;
    }
    User other = (User)obj;
    return firstName.equals(other.firstName) && lastName.equals(other.lastName) && phoneNumber==other.phoneNumber && isMember == other.isMember;
  }
}
