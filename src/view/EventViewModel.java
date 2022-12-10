package view;

import javafx.beans.property.*;
import model.Event;

import java.time.LocalDate;

public class EventViewModel  //
{
  private StringProperty eventNameProperty;
  private StringProperty eventPlaceProperty;
  private ObjectProperty<LocalDate> eventDateProperty;
  private StringProperty eventDescriptionProperty;



  public EventViewModel(Event event)
  {
    eventNameProperty = new SimpleStringProperty(event.getTitle());
    eventPlaceProperty = new SimpleStringProperty(event.getLocation());
    eventDateProperty = new SimpleObjectProperty(event.getDate());
    eventDescriptionProperty = new SimpleStringProperty(event.getDescription());
  }

  public StringProperty getEventNameProperty(){return eventNameProperty;}
  public StringProperty getEventPlaceProperty(){return eventPlaceProperty;}
  public ObjectProperty getEventDateProperty() {return eventDateProperty;}
  public StringProperty getEventDescriptionProperty() {
    return eventDescriptionProperty;
  }
}
