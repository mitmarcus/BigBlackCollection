package view;

import model.Game;
import model.BBCmodel;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;
import java.util.ArrayList;

public class GameListViewModel  //
{
  private ObservableList<GameViewModel> list;
  private BBCmodel model;

  public GameListViewModel(BBCmodel model)
  {
    this.model = model;
    list = FXCollections.observableArrayList();
  }

  public ObservableList<GameViewModel> update()  //Code For updating table of games
  {
    ArrayList<Game> games = new ArrayList<>();
    for (int i = 0; i <model.getGameListSize(); i++)
    {
      games.add(model.getGameByIndex(i));
    }
    list.clear();
    for (int j = 0; j< games.size(); j++)
    {
      list.add(new GameViewModel(games.get(j)));
    }
    return list;
  }



  public void remove(Game game)
  {
    for (int i = 0; i <list.size(); i++)
    {
      if (list.get(i).getGameNamePropertyProperty().get().equals(game.getNameOfGame()) && list.get(i).getOwnerPropertyProperty().get().equals(game.getOwner())
       &&  list.get(i).getNoOfPlayersPropertyProperty().get() == game.getNoOfPlayers())
      {
        list.remove(i);
        break;
      }
    }
  }

  public void add(Game game)
  {
    list.add(new GameViewModel(game));
  }

  public ObservableList<GameViewModel> getList()
  {
    return list;
  }
}
