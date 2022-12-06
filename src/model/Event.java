package model;
import java.util.ArrayList;

public class Event {

  private String title;
  private String location;
  private String description;
  private Date date;
  private ArrayList<User> participants;
  private Game game;

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
    if (participants != null) {
      for (int i = 0; i < participants.size(); i++) {
        list += participants.get(i).getFirstName() + " " + participants.get(i).getLastName() + ", ";
      }
    }
    return list;
  }

  public ArrayList<User> getMembersArray()
  {
    return participants;
  }

  public void setDate(Date date)
  {
    this.date = date;
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

  public String getDescription() {
    return description;
  }
  public String getLocation() {
    return location;
  }
  public String getTitle() {
    return title;
  }
  public Date getDate() {
    return date;
  }
}
