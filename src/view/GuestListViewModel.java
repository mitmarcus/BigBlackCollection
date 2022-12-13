package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.Player;

import java.util.ArrayList;

public class GuestListViewModel  //
{
  private ObservableList<GuestViewModel> list;

  private BBCmodel model;

  public GuestListViewModel(BBCmodel model)
  {
  this.model = model;
  list =FXCollections.observableArrayList();
  }

  public ObservableList<GuestViewModel> getList()
  {
    return list;
  }


  public ObservableList<GuestViewModel> update()  //Code For guesttable
  {
    ArrayList<Player> players = new ArrayList<>();
    for (int i = 0; i <model.getGuestListSize(); i++)
    {
      players.add(model.getGuestByIndex(i));
    }
    list.clear();
    for (int j = 0; j< players.size(); j++)
    {
      list.add(new GuestViewModel(players.get(j)));
    }
    return list;
  }




  public void remove(Player player)
  {
    for (int i = 0; i <list.size(); i++)
    {
      if ((list.get(i).getFullNameProperty().get().equals(player.getFullName()) && Long.parseLong(
        String.valueOf(list.get(i).getPhoneProperty().get()))== player.getPhoneNumber()))
      {
        list.remove(i);

        break;
      }
    }
  }

  public void add(Player player)
  {
    list.add(new GuestViewModel(player));
  }




}
