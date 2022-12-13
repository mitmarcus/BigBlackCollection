package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Player;

public class AddParticipantViewController //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private PlayerListViewModel viewModel;

  @FXML private TableView<UserViewModel> userListTable;
  @FXML private TableColumn<UserViewModel, String> nameColumn;

  public AddParticipantViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new PlayerListViewModel(model);

    nameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    userListTable.setItems(viewModel.getList());
    reset();
  }

  public Region getRoot()
  {
    return root;
  }


  @FXML private void goBack()
  {
    viewHandler.openView("eventParticipants");
  }
  public void reset() {
    userListTable.setItems(viewModel.update());
  }
  @FXML private void confirmAdd()
  {
    UserViewModel selectedItem = userListTable.getSelectionModel().getSelectedItem();
    Player player = new Player(selectedItem.getFirstNameProperty().get(),
        selectedItem.getLastNameProperty().get(),
        selectedItem.getPhoneProperty().get(), true);
    model.addParticipant(player);
    viewModel.update();
    viewHandler.openView("events");

  }


}
