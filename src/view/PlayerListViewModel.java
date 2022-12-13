package view;
import model.Player;
import model.BBCmodel;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;

public class PlayerListViewModel  //
{
  private ObservableList<UserViewModel> list;

  private BBCmodel model;

  public PlayerListViewModel(BBCmodel model)
  {
  this.model = model;
  list =FXCollections.observableArrayList();
  }

  public ObservableList<UserViewModel> getList()
  {
    return list;
  }
  public ObservableList<UserViewModel> update()  //Code For Member Table
  {
    ArrayList<Player> players = new ArrayList<>();
    for (int i = 0; i <model.getUserListSize(); i++)
    {
      players.add(model.getUser(i));
    }
    list.clear();
    for (int j = 0; j< players.size(); j++)
    {
      list.add(new UserViewModel(players.get(j)));
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
    list.add(new UserViewModel(player));
  }





}
