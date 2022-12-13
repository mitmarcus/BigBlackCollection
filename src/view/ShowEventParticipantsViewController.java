package view;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.BBCmodel;

public class ShowEventParticipantsViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private EventParticipantsViewModel viewModel;

  @FXML private TableView<PlayerViewModel> participantListTable;
  @FXML private TableColumn<PlayerViewModel, String> nameColumn;
  @FXML private TableColumn<PlayerViewModel, Number> phoneColumn;
  @FXML private TableColumn<PlayerViewModel, String> statusColumn;


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

    nameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    phoneColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
    statusColumn.setCellValueFactory(
        cellData -> cellData.getValue().getStatusProperty());
    participantListTable.setItems(viewModel.getList());
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

@FXML void addParticipant()
{
  viewHandler.openView("addParticipant");
}
}
