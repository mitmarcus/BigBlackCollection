package view;
import javafx.beans.property.*;
import model.Game;
public class GameViewModel //
{

  private StringProperty gameNameProperty;
  private IntegerProperty noOfPlayersProperty;
  private IntegerProperty ratingProperty;
  private ObjectProperty ownerProperty;


  public GameViewModel(Game game)
  {
    gameNameProperty = new SimpleStringProperty(game.getNameOfGame());
    noOfPlayersProperty = new SimpleIntegerProperty(game.getNoOfPlayers());
    ratingProperty = new SimpleIntegerProperty(game.getRating());
    ownerProperty = new SimpleObjectProperty(game.getOwner().getFirstName());
  }


  public StringProperty getGameNamePropertyProperty()
  {
    return gameNameProperty;
  }


  public IntegerProperty getNoOfPlayersPropertyProperty()
  {
    return noOfPlayersProperty;
  }


  public IntegerProperty getRatingPropertyProperty()
  {
    return ratingProperty;
  }


  public ObjectProperty getOwnerPropertyProperty()
  {
    return ownerProperty;
  }
}
