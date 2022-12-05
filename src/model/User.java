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



  public String getFirstName()
  {
    return firstName +"";
  }

  public String getLastName()
  {
    return lastName +"";
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

  //should we?
  public void setMember(boolean isMember)
  {
    this.isMember = isMember;
  }
}
