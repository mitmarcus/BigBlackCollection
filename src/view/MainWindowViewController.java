package view;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import model.BBCmodel;

import java.util.Optional;

public class MainWindowViewController  //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;


  public MainWindowViewController() {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root) {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;

    reset();
  }

  public void reset() {
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void showUsersWindow()
  {
    viewHandler.openView("users");
  }
  @FXML private void showEventsWindow()
  {
    viewHandler.openView("events");
  }
  @FXML private void showGamesWindow()
  {
    viewHandler.openView("games");
  }
  @FXML private void showReservationsWindow()
  {
    viewHandler.openView("reservations");
  }

}
