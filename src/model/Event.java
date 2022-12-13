package model;

import java.time.LocalDate;

/**
 * A class that stores the Event
 *
 * @author Marcus Mitelea
 */
public class Event {
    private String title;
    private String location;
    private String description;
    private LocalDate date;

    public Event(String title, String location, String description, Object date)
    {
        this.title = title;
        this.location = location;
        this.description = description;
        this.date =  (LocalDate) date;
    }

    public Event(String title, String location, String description)
    {
        setTitle(title);
        setLocation(location);
        setDescription(description);
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
