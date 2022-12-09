package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Region;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.User;


import java.util.Optional;

public class ShowGuestsListViewController //

{

  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private GuestListViewModel viewModel;

  @FXML private TableView<GuestViewModel> userListTable;
  @FXML private TableColumn<GuestViewModel, Number> phoneNumberColumn;
  @FXML private TableColumn<GuestViewModel, String> fullNameColumn;

  public ShowGuestsListViewController()
  {
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new GuestListViewModel(model);


    fullNameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    phoneNumberColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
    userListTable.setItems(viewModel.getList());
      reset();

  }

  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
    userListTable.setItems(viewModel.update());
  }

  @FXML private void goBack()
  {
    viewHandler.openView("main");
  }

  @FXML private void addNewMember()
  {
    viewHandler.openView("addGuest");
  }

  @FXML private void removeMember()
  {

    GuestViewModel selectedItem = userListTable.getSelectionModel().getSelectedItem();

    boolean remove = confirmation();

    if (remove)
    {
      User user = new User(selectedItem.getFirstNameProperty().get(),
          selectedItem.getLastNameProperty().get(),
          selectedItem.getPhoneProperty().get(), false);

      model.removeGuest(user);
      viewModel.remove(user);
      userListTable.getSelectionModel().clearSelection();

    }
  }

    @FXML private void editMember ()
  {

  }




  private boolean confirmation()
  {
    int index = userListTable.getSelectionModel().getSelectedIndex();
    GuestViewModel selectedItem = userListTable.getItems().get(index);
    if (index < 0 || index >= userListTable.getItems().size())
    {
      return false;
    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(
        "Removing user {" + selectedItem.getFullNameProperty().get() + ": "
            + selectedItem.getPhoneProperty().get() + "}");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK));
  }
}




