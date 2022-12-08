package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Event;
import model.MyDate;
import model.User;
import org.w3c.dom.Text;

import java.util.Date;

public class CreateAnEventViewController //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField eventNameText;
  @FXML private TextField eventLocationText;
  @FXML private MyDate eventDateText;
  @FXML private TextField eventDescriptionText;

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
    this.eventDateText.set(0, 0, 0);
    this.eventDescriptionText.setText((""));
  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("events");
  }

   @FXML private void createEvent()
  {
    /*Event event = new Event(eventNameText.getText(), eventLocationText.getText(), eventDescriptionText.getText(),
        eventDateText.get);
    model.addEvent(event);*/
    viewHandler.openView("events");
  }
}
