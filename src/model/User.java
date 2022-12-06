package model;

public class User {

  private boolean isMember;
  private String firstName;
  private String lastName;
  private long phoneNumber;


  public User(String firstName, String lastName, long phoneNumber, boolean isMember)
  {

    this.isMember = isMember;
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

//  public String toString()
//  {
//
//  }
}
