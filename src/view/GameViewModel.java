package view;
import javafx.beans.property.*;
import model.Game;
public class GameViewModel
{

  private StringProperty gameNameProperty;
  private IntegerProperty noOfPlayersProperty;
  private ObjectProperty ratingProperty;
  private ObjectProperty ownerProperty;


  public GameViewModel(Game game)
  {
    gameNameProperty = new SimpleStringProperty(game.getNameOfGame());
    noOfPlayersProperty = new SimpleIntegerProperty(game.getMaxPlayers());
    ownerProperty = new SimpleObjectProperty(game.getOwner());
  }


  public StringProperty getGameNamePropertyProperty()
  {
    return gameNameProperty;
  }


  public IntegerProperty getNoOfPlayersPropertyProperty()
  {
    return noOfPlayersProperty;
  }


  public ObjectProperty getRatingPropertyProperty()
  {
    return ratingProperty;
  }


  public ObjectProperty getOwnerPropertyProperty()
  {
    return ownerProperty;
  }
}
