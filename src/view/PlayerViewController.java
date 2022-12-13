package view;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import model.BBCmodel;
public class PlayerViewController       //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;


  public PlayerViewController()
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
  }

  @FXML private void goBack()
  {
    viewHandler.openView("main");
  }
  @FXML private void showListOfMembers()
  {
    viewHandler.openView("member");
  }
  @FXML private void showListOfGuest()
  {
    viewHandler.openView("guest");
  }


}
