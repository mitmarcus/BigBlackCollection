package view;

import java.util.Optional;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Region;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LongStringConverter;
import javafx.util.converter.NumberStringConverter;
import model.BBCmodel;
import model.User;
import model.UserList;


public class ShowMembersListViewController //
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

    userListTable.setEditable(true);


    fullNameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    fullNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());


    phoneNumberColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
   phoneNumberColumn.setCellFactory(TextFieldTableCell.forTableColumn(new NumberStringConverter()));

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

  public void editName(TableColumn.CellEditEvent<UserViewModel,String> userViewModelStringCellEditEvent)
  {
    UserViewModel user0 = userListTable.getSelectionModel().getSelectedItem();
    User user1 = model.getUserByFullName(user0.getFullNameProperty().get());
    user1.setFullName((userViewModelStringCellEditEvent.getNewValue()));
  }

  public void editPhoneNumber(TableColumn.CellEditEvent<UserViewModel,Number> userViewModelNumberCellEditEvent)
  {
    UserViewModel user = userListTable.getSelectionModel().getSelectedItem();
    User user1 = model.getUserByPhoneNumber(user.getPhoneProperty().get());
    user1.setPhoneNumber(Long.parseLong(String.valueOf(userViewModelNumberCellEditEvent.getNewValue())));
  }
}
