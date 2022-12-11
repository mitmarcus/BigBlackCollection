package model;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {

  private String title;
  private String location;
  private String description;
  private LocalDate date;
  private ArrayList<User> participantList;

  public Event(String title, String location, String description, Object date)
  {
    this.title = title;
    this.location = location;
    this.description = description;
    this.date =  (LocalDate) date;
    participantList = new ArrayList<User>();
  }

  public Event(String title, String location, String description)
  {
    setTitle(title);
    setLocation(location);
    setDescription(description);
  }

  //Jakub test for utils
	public Event(String test_title, String horsens, String description, int i, int i1) {
	}


  public void addParticipant(User participant)
  {
    participantList.add(participant);
  }

  public void removeParticipant(User participant)
  {
    participantList.remove(participant);
  }

  public ArrayList<User> getParticipants()
  {
    return participantList;
  }

  public String getListOfParticipants()
  {
    String list = "";
    for(int i = 0; i<participantList.size(); i++)
    {
      list += participantList.get(i).getFirstName() + " " + participantList.get(i).getLastName() + ", ";
    }
    return list;
  }

  public LocalDate getDate()
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

  @Override public boolean equals(Object obj){
    if ((obj == null) || (obj.getClass() != this.getClass())) {
      return false;
    }
    Event other = (Event) obj;
    return (title.equals(other.title) && location.equals(other.location) && description.equals(other.description) && date.equals(other.date));
  }

}
