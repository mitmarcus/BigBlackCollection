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
    Event a = null;
    for(int i = 0; i<eventList.size();i++)
    {
      if (event == eventList.get(i))
      {
        a = eventList.get(i);
      }
    }
    return a;
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
