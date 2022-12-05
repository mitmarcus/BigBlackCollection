package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Game;

import java.util.Optional;

public class ShowAllGamesViewController
{

  private Region root;
  private BBCmodel model;
  private ViewHandler viewHandler;
  private GameListViewModel viewModel;
  @FXML private TableView<GameViewModel> gameListTable;
  @FXML private TableColumn<GameViewModel, Number> ratingColumn;
  @FXML private TableColumn<GameViewModel, Number> playersColumn;
  @FXML private TableColumn<GameViewModel, String> nameColumn;
  @FXML private TableColumn<GameViewModel, String> ownerColumn;


  public ShowAllGamesViewController()
  {
    // Called by FXMLLoader
  }

  public void init(ViewHandler viewHandler, BBCmodel model, Region root)
  {
    this.model = model;
    this.viewHandler = viewHandler;
    this.root = root;
    this.viewModel = new GameListViewModel(model);

   /* fullNameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getFullNameProperty());
    phoneNumberColumn.setCellValueFactory(
        cellData -> cellData.getValue().getPhoneProperty());
    userListTable.setItems(viewModel.getList());
    viewModel.update();*/


  }
  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
    //viewModel.update();
  }

  @FXML private void goBack()
  {
    viewHandler.openView("main");
  }
  @FXML private void addGame()
  {
    viewHandler.openView("addGame");
  }
  @FXML private void removeGame()
  {

    GameViewModel selectedItem = gameListTable.getSelectionModel().getSelectedItem();

    boolean remove = confirmation();

    if (remove)
    {
      Game game = new Game(selectedItem.getFirstNameProperty().get(),
          selectedItem.getLastNameProperty().get(),
          selectedItem.getPhoneProperty().get(), true);

      model.removeUser(user);
      //viewModel.remove(user);
      gameListTable.getSelectionModel().clearSelection();

    }


  }
  @FXML private void editGame()
  {

  }

  private boolean confirmation()
  {
    int index = gameListTable.getSelectionModel().getSelectedIndex();
    GameViewModel selectedItem = gameListTable.getItems().get(index);
    if (index < 0 || index >= gameListTable.getItems().size())
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
