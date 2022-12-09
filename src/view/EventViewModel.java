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



  public EventViewModel(Event reservation)
  {
    eventNameProperty = new SimpleStringProperty(reservation.getTitle());
    eventPlaceProperty = new SimpleStringProperty(reservation.getLocation());
    eventDateProperty = new SimpleObjectProperty(reservation.getDate());
    eventDescriptionProperty = new SimpleStringProperty(reservation.getDescription());
  }

  public StringProperty getEventNameProperty(){return eventNameProperty;}
  public StringProperty getEventPlaceProperty(){return eventPlaceProperty;}
  public ObjectProperty getEventDateProperty() {return eventDateProperty;}
  public StringProperty getEventDescriptionProperty() {
    return eventDescriptionProperty;
  }
}
