package model;

import java.util.ArrayList;

/**
 * A class that stores the Event objects into a list
 *
 * @author Duarte Jorge
 */
public class EventList
{
    private ArrayList<Event> eventList;

    /**
     * No-argument constructor initializing the list
     */
    public EventList()
    {
        eventList = new ArrayList<>();
    }

    /**
     * Adds an Event object to the list
     *
     * @param event the Event to add
     */
    public void addEvent(Event event)
    {
        eventList.add(event);
    }

    /**
     * Removes an Event object from the list
     *
     * @param event the Event to remove
     */
    public void removeEvent(Event event)
    {
        eventList.remove(event);
    }

    /**
     * Gets the number of events in the list
     *
     * @return the number of events in the list as an integer
     */
    public int getEventListSize()
    {
        return eventList.size();
    }

    /**
     * Gets an Event object from position index from the list
     *
     * @param index the position of the Event object in the list
     * @return the Event at index if one exists, else null
     */
    public Event getEventByIndex(int index)
    {
        return eventList.get(index);
    }
}
