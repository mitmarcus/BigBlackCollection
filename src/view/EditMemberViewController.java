package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Player;

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
    Player player = new Player(firstNameText.getText(), lastNameText.getText(),
        Long.parseLong(phoneText.getText()), true);
    model.addMember(player);
    viewHandler.openView("member");


  }


}
