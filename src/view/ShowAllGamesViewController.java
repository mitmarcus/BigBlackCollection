package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Region;
import javafx.util.converter.NumberStringConverter;
import model.*;

import java.util.Optional;

public class ShowAllGamesViewController //
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

    gameListTable.setEditable(true);

   nameColumn.setCellValueFactory(
        cellData -> cellData.getValue().getGameNamePropertyProperty());
    nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());

    ownerColumn.setCellValueFactory(
        cellData -> cellData.getValue().getOwnerPropertyProperty());


    ratingColumn.setCellValueFactory(
        cellData -> cellData.getValue().getRatingPropertyProperty());
    ratingColumn.setCellFactory(TextFieldTableCell.forTableColumn(new NumberStringConverter()));


    playersColumn.setCellValueFactory(
        cellData -> cellData.getValue().getNoOfPlayersPropertyProperty());
    playersColumn.setCellFactory(TextFieldTableCell.forTableColumn(new NumberStringConverter()));

    gameListTable.setItems(viewModel.getList());
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
      for (int i = 0; i < model.getMemberListSize() ; i++)
      {
        if (model.getMemberByIndex(i).getFirstName().equals(selectedItem.getOwnerPropertyProperty().get()))
        {
          Game game = new Game(selectedItem.getGameNamePropertyProperty().get(),
              selectedItem.getNoOfPlayersPropertyProperty().get(), model.getMemberByIndex(i), selectedItem.getRatingPropertyProperty().get());
          model.removeGame(game);
          gameListTable.getSelectionModel().clearSelection();
          viewModel.update();

        }

      }

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
        "Removing Game {" + selectedItem.getGameNamePropertyProperty().get() +
            "}");
    Optional<ButtonType> result = alert.showAndWait();
    return ((result.isPresent()) && (result.get() == ButtonType.OK)) ;

  }

  public void editGameName(TableColumn.CellEditEvent<GameViewModel,String> gameViewModelStringCellEditEvent)
  {
    GameViewModel game = gameListTable.getSelectionModel().getSelectedItem();
    Game game1 = model.getGameByName(game.getGameNamePropertyProperty().get());
    game1.setNameOfGame((gameViewModelStringCellEditEvent.getNewValue()));
  }

  public void editNoOfPlayers(TableColumn.CellEditEvent<GameViewModel,Number> gameViewModelNumberCellEditEvent)
  {
    GameViewModel game = gameListTable.getSelectionModel().getSelectedItem();
    Game game1 = model.getGameByName(game.getGameNamePropertyProperty().get());
    game1.setNoOfPlayers((Integer.parseInt(String.valueOf(gameViewModelNumberCellEditEvent.getNewValue()))));
  }

  public void editRatingScore(TableColumn.CellEditEvent<GameViewModel,Number> gameViewModelNumberCellEditEvent)
  {
    GameViewModel game = gameListTable.getSelectionModel().getSelectedItem();
    Game game1 = model.getGameByName(game.getGameNamePropertyProperty().get());
    game1.setRatingScore((Integer.parseInt(String.valueOf(gameViewModelNumberCellEditEvent.getNewValue()))));
  }



}
