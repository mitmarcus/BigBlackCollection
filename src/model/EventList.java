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
    eventList.add(event);
  }


  public void removeEvent(Event event)
  {
    eventList.remove(event);
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
  public int getEventListSize()
  {
    return eventList.size();
  }

  public Event getEventByIndex(int index)
  {
    return eventList.get(index);
  }


}
