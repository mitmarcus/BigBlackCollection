package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.User;

public class AddEventViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField firstNameText;
  @FXML private TextField lastNameText;
  @FXML private TextField phoneText;

  public AddEventViewController(){
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
    this.firstNameText.setText("");
    this.lastNameText.setText("");
    this.phoneText.setText("");
  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("events");
  }
   @FXML private void addParticipant()
  {
    User user = new User(firstNameText.getText(), lastNameText.getText(),
        Long.parseLong(phoneText.getText()));
    model.addParticipant(user);
    viewHandler.openView("events");

  }


}
