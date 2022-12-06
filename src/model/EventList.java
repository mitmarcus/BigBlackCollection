package model;

import java.util.ArrayList;

public class EventList
{
  private ArrayList<Event> eventList;
  private ArrayList<User> participantList;

  public EventList()
  {
    eventList = new ArrayList<Event>();
    participantList = new ArrayList<>();
  }
  public void addEvent(Event event)
  {
    addEvent(event);
  }

  public void addParticipant(Event event, User user)
  {
    for (int i = 0; i< eventList.size();i++)
    {
      if (event == eventList.get(i))
      {
        participantList.add(user);
      }
    }
  }

  public void remove(Event event)
  {
    remove(event);
  }

  public Event getEvent(Event event)
  {
    Event event1 = null;
    for(int i = 0; i<eventList.size(); i++)
    {
      if(eventList.get(i).equals(event))
      {
        event1 = event;
      }
    }
    return event1;
  }


}
