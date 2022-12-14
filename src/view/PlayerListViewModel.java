package view;
import model.Player;
import model.BBCmodel;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;

public class PlayerListViewModel  //
{
  private ObservableList<PlayerViewModel> list;

  private BBCmodel model;

  public PlayerListViewModel(BBCmodel model)
  {
  this.model = model;
  list =FXCollections.observableArrayList();
  }

  public ObservableList<PlayerViewModel> getList()
  {
    return list;
  }
  public ObservableList<PlayerViewModel> update()  //Code For Member Table
  {
    ArrayList<Player> players = new ArrayList<>();
    for (int i = 0; i <model.getMemberListSize(); i++)
    {
      players.add(model.getMemberByIndex(i));
    }
    list.clear();
    for (int j = 0; j< players.size(); j++)
    {
      list.add(new PlayerViewModel(players.get(j)));
    }
    return list;
  }



  public void remove(Player player)
  {
    for (int i = 0; i <list.size(); i++)
    {
      if (list.get(i).getFullNameProperty().get().equals(player.getFullName()) && Long.parseLong(
          String.valueOf(list.get(i).getPhoneProperty().get()))== player.getPhoneNumber())
      {
        list.remove(i);
        break;
      }
    }
  }

  public void add(Player player)
  {
    list.add(new PlayerViewModel(player));
  }





}
