package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.Player;

import java.util.ArrayList;

public class EventParticipantsViewModel
{
  private ObservableList<UserViewModel> list;
  private BBCmodel model;

  public EventParticipantsViewModel(BBCmodel model)
  {
    this.model = model;
    list = FXCollections.observableArrayList();
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

}

