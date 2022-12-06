package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Event;

public class ShowEventParticipantsViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private EventParticipantsViewModel viewModel;


  public ShowEventParticipantsViewController()
  {
    //Called by FXMLLoader
  }
  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new EventParticipantsViewModel(model);
  }
  public Region getRoot()
  {
    return root;
  }


  public void reset() {
    viewModel.update();
  }
  @FXML private void goBack()
{
  viewHandler.openView("events");
}
}
