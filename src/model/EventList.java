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

  public Event getEventByIndex(int index)
  {
    if (index >= 0 && index < eventList.size())
      return eventList.get(index);
    else
      return null;
  }
}
