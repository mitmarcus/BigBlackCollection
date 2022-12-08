package view;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Event;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class CreateAnEventViewController //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField eventNameText;
  @FXML private TextField eventLocationText;
  @FXML private DatePicker eventDateText;
  @FXML private TextArea eventDescriptionText;

  public CreateAnEventViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;

    reset();
  }

  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
    this.eventNameText.setText("");
    this.eventLocationText.setText("");
    this.eventDescriptionText.setText((""));
  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("events");
  }


   @FXML private void createEvent()
  {
<<<<<<< HEAD
    Event event = new Event(eventNameText.getText(), eventLocationText.getText(), eventDescriptionText.getText(),
        eventDateText.getValue());
    model.addEvent(event);
=======
    /*Event event = new Event(eventNameText.getText(), eventLocationText.getText(), eventDescriptionText.getText(),
        eventDateText.get);
    model.addEvent(event);*/
>>>>>>> 8118c697f7121309ec594d4c819aafbe31c03bd0
    viewHandler.openView("events");
  }
}
