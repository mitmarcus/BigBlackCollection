package model;

import java.util.ArrayList;

public class EventList
{
  private ArrayList<Event> eventList;

  public EventList()
  {
    eventList = new ArrayList<Event>();
  }
  public void addEvent(Event event)
  {
    addEvent(event);
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
      if(eventList.get(i) == event)
      {
        event1 = event;
      }
    }
    return event1;
  }


}
