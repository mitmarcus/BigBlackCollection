package model;

import java.util.ArrayList;

/**
 * A class that stores the Event objects into a list
 *
 * @author Marcus Mitelea
 */
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

    public int getEventListSize()
    {
        return eventList.size();
    }

    public Event getEventByIndex(int index)
    {
        return eventList.get(index);
    }


}
