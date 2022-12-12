package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Game;
import model.User;

public class AddNewGameViewController //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField nameTextField;
  @FXML private TextField playersTextField;
  @FXML private TextField ownerTextField;



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
    this.nameTextField.setText("");
    this.playersTextField.setText("");
    this.ownerTextField.setText("");
  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("games");
  }
  @FXML private void addGame()
  {
     for (int i = 0; i < model.getUserListSize(); i++)
  {
    if (model.getUser(i).getPhoneNumber() == Long.parseLong(ownerTextField.getText()))
    {
      User user1 = model.getUser(i);
      Game game = new Game(nameTextField.getText(), Integer.parseInt(playersTextField.getText()),
          user1, 0);
      model.addGame(game);
      viewHandler.openView("games");
      break;
    }

  }
  }
}
