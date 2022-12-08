package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Event;
import model.MyDate;

import java.util.ArrayList;
import java.util.Optional;

public class ShowEventListViewController  //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private EventListViewModel viewModel;

  @FXML private TableView<EventViewModel> eventListTable;
  @FXML private TableColumn<EventViewModel, String> eventName;
  @FXML private TableColumn<EventViewModel, String> eventPlace;
  @FXML private TableColumn<EventViewModel, MyDate> eventDate;
  @FXML private TableColumn<EventViewModel, String> eventDescription;

  public ShowEventListViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new EventListViewModel(model);

    eventName.setCellValueFactory(
        cellData -> cellData.getValue().getEventNameProperty());
    eventPlace.setCellValueFactory(
        cellData -> cellData.getValue().getEventPlaceProperty());
    eventDate.setCellValueFactory(
        cellData -> cellData.getValue().getEventDateProperty());
    eventDescription.setCellValueFactory(
        cellData -> cellData.getValue().getEventDescriptionProperty());
    eventListTable.setItems(viewModel.getList());
    viewModel.update();
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
    viewHandler.openView("main");
  }
  @FXML private void addNewEvent()
  {
    viewHandler.openView("addEvent");
  }
  @FXML private void showParticipants()
  {
    viewHandler.openView("eventParticipants");
  }
  @FXML private void removeEvent()
  {

   EventViewModel selectedItem = eventListTable.getSelectionModel().getSelectedItem();

    boolean remove = confirmation();

    if (remove)
    {
      Event event = new Event(selectedItem.getEventNameProperty().get(),
          selectedItem.getEventPlaceProperty().get(),
          selectedItem.getEventDescriptionProperty().get(),
          (MyDate) selectedItem.getEventDateProperty().get());

      model.removeEvent(event);
      viewModel.remove(event);
      eventListTable.getSelectionModel().clearSelection();

    }
  }

  private boolean confirmation()
  {
    int index = eventListTable.getSelectionModel().getSelectedIndex();
    EventViewModel selectedItem = eventListTable.getItems().get(index);
    if (index < 0 || index >= eventListTable.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing event {" + selectedItem.getEventNameProperty().get() + ": "
            + selectedItem.getEventDateProperty().get() + "}");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK)) ;

  }
}
