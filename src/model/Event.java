package model;
import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable {

  private String title;
  private String location;
  private String description;
  private Date date;
  private ArrayList<User> participants;

  public Event(String title, String location, String description, Date date, ArrayList<User> participants)
  {
    setTitle(title);
    setLocation(location);
    setDescription(description);
    setDate(date);
  }

  public void addParticipant(User participant)
  {
    participants.add(participant);
  }

  public void removeParticipant(User participant)
  {
    participants.remove(participant);
  }

  public String getListOfParticipants()
  {
    String list = "";
    for(int i = 0; i<participants.size(); i++)
    {
      list += participants.get(i).getFirstName() + " " + participants.get(i).getLastName() + ", ";
    }
    return list;
  }

  public Date getDate()
  {
    return date;
  }

  public String getLocation()
  {
    return location;
  }

  public String getTitle()
  {
    return title;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDate(Date date)
  {
    this.date = date.copy();
  }

  public void setLocation(String location)
  {
    this.location = location;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

//  public String toString()
//  {
//
//  }
}
