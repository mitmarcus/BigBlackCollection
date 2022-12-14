package view;

import java.text.DecimalFormat;
import java.util.Optional;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Region;
import javafx.util.converter.NumberStringConverter;
import model.BBCmodel;
import model.Player;


public class ShowMembersListViewController //
{
  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private PlayerListViewModel viewModel;
  @FXML private TableView<PlayerViewModel> userListTable;
  @FXML private TableColumn<PlayerViewModel, Number> phoneNumberColumn;
  @FXML private TableColumn<PlayerViewModel, String> fullNameColumn;
  DecimalFormat formatter = new DecimalFormat("########");



  public ShowMembersListViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new PlayerListViewModel(model);

    userListTable.setEditable(true);


    fullNameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    fullNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());


    phoneNumberColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
    phoneNumberColumn.setCellFactory(TextFieldTableCell.forTableColumn(new NumberStringConverter(formatter)));

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

    PlayerViewModel selectedItem = userListTable.getSelectionModel().getSelectedItem();

    boolean remove = confirmation();

    if (remove)
    {
      Player player = new Player(selectedItem.getFirstNameProperty().get(),
          selectedItem.getLastNameProperty().get(),
          selectedItem.getPhoneProperty().get(), true);

      model.removeMember(player);
      viewModel.remove(player);
      userListTable.getSelectionModel().clearSelection();

    }
  }
  @FXML private void editMember()
  {

  }

  private boolean confirmation()
  {
    int index = userListTable.getSelectionModel().getSelectedIndex();
    PlayerViewModel selectedItem = userListTable.getItems().get(index);
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

  public void editName(TableColumn.CellEditEvent<PlayerViewModel,String> userViewModelStringCellEditEvent)
  {
    PlayerViewModel user0 = userListTable.getSelectionModel().getSelectedItem();
    Player player1 = model.getMemberByFullName(user0.getFullNameProperty().get());
    player1.setFullName((userViewModelStringCellEditEvent.getNewValue()));
  }

  public void editPhoneNumber(TableColumn.CellEditEvent<PlayerViewModel,Number> userViewModelNumberCellEditEvent)
  {
    PlayerViewModel user = userListTable.getSelectionModel().getSelectedItem();
    Player player1 = model.getMemberByPhoneNumber(user.getPhoneProperty().get());
    player1.setPhoneNumber(Long.parseLong(String.valueOf(userViewModelNumberCellEditEvent.getNewValue())));
  }
}
