package view;

import java.util.Optional;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.User;
import model.UserList;


public class ShowMembersListViewController
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private UserlistViewModel viewModel;
  @FXML private TableView<UserViewModel> userListTable;
  @FXML private TableColumn<UserViewModel, Number> phoneNumberColumn;
  @FXML private TableColumn<UserViewModel, String> fullNameColumn;


  public ShowMembersListViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new UserlistViewModel(model);

    fullNameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    phoneNumberColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
    userListTable.setItems(viewModel.getList());
    viewModel.update();
  }
  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
    viewModel.update();
  }

  @FXML private void goBack()
  {
    viewHandler.openView("main");
  }
  @FXML private void addNewMember()
  {
    viewHandler.openView("addMember");
  }
  @FXML private void removeMember()
  {

    UserViewModel selectedItem = userListTable.getSelectionModel().getSelectedItem();

    boolean remove = confirmation();

    if (remove)
    {
      User user = new User(selectedItem.getFirstNameProperty().get(),
          selectedItem.getLastNameProperty().get(),
          selectedItem.getPhoneProperty().get(), true);

      model.removeUser(user);
      viewModel.remove(user);
      userListTable.getSelectionModel().clearSelection();
    }
  }
  @FXML private void editMember()
  {
    viewHandler.openView("editMember");
  }

  private boolean confirmation()
  {
    int index = userListTable.getSelectionModel().getSelectedIndex();
    UserViewModel selectedItem = userListTable.getItems().get(index);
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
    return ((result.isPresent()) && (result.get() == ButtonType.OK)) ;

  }
}
