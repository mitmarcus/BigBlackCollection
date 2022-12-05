package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Game;

public class AddNewGameViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField firstNameText;
  @FXML private TextField lastNameText;
  @FXML private TextField phoneText;



  public AddNewGameViewController()
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
    this.firstNameText.setText("");
    this.lastNameText.setText("");
    this.phoneText.setText("");
  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("games");
  }
  @FXML private void addGame()
  {
    User user = new User(firstNameText.getText(), lastNameText.getText(),
        Long.parseLong(phoneText.getText()), true);
    model.addUser(user);
    viewHandler.openView("member");


  }
}
