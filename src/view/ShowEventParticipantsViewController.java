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
  @FXML private TableView<EventViewModel> EventListTable;
  @FXML private TableColumn<EventViewModel, String> eventName;
  @FXML private TableColumn<EventViewModel, String> eventPlace;
  @FXML private TableColumn<EventViewModel, Number> eventDate;

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
    eventName.setCellValueFactory(
        cellData -> cellData.getValue().getEventNameProperty());
    eventPlace.setCellValueFactory(
        cellData -> cellData.getValue().getEventPlaceProperty());
    eventDate.setCellValueFactory(
        cellData -> cellData.getValue().getEventDateProperty());

  }
  public Region getRoot()
  {
    return root;
  }

  @FXML private void goBack()
  {
    viewHandler.openView("events");
  }
  public void reset() {
    viewModel.update();
  }
}
