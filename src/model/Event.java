package model;

import java.time.LocalDate;

/**
 * A class that stores the Event
 *
 * @author Duarte Jorge
 */
public class Event {
    private String title;
    private String location;
    private String description;
    private LocalDate date;

    /**
     * Four-argument constructor initializing the Event
     *
     * @param title       the title to initialize
     * @param location    the location to initialize
     * @param description the description to initialize
     * @param date        the date to initialize
     */
    public Event(String title, String location, String description, Object date)
    {
        this.title = title;
        this.location = location;
        this.description = description;
        this.date =  (LocalDate) date;
    }

    /**
     * Gets the date from the Event
     *
     * @return the date as a LocalDate
     */
    public LocalDate getDate()
    {
        return date;
    }

    /**
     * Gets the location from the Event
     *
     * @return the location as a String
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Gets the title from the Event
     *
     * @return the title as a String
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the description from the Event
     *
     * @return the description as a String
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Checks if the Event is the same as the other Object
     *
     * @param obj the Object to check with
     * @return true if the Object obj is the same as the Event, else false
     */
    @Override public boolean equals(Object obj){
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        Event other = (Event) obj;
        return (title.equals(other.title) && location.equals(other.location) && description.equals(other.description) && date.equals(other.date));
    }

}
