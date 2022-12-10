package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.User;
import model.UserList;

public class EditMemberViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  @FXML private TextField firstNameText;
  @FXML private TextField lastNameText;
  @FXML private TextField phoneText;



  public EditMemberViewController()
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
    this.firstNameText.getText();
    this.lastNameText.getText();
    this.phoneText.getText();

  }

  @FXML private void returnButtonPressed()
  {
    viewHandler.openView("member");
  }
  @FXML private void editMember()
  {
    User user = new User(firstNameText.getText(), lastNameText.getText(),
        Long.parseLong(phoneText.getText()), true);
    model.addUser(user);
    viewHandler.openView("member");


  }


}
