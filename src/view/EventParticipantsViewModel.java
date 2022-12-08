package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.Event;
import model.User;

import java.util.ArrayList;

public class EventParticipantsViewModel
{
  private ObservableList<EventParticipantsViewModel> list;
  private BBCmodel model;

  public EventParticipantsViewModel(BBCmodel model)
  {
    this.model = model;
    list = FXCollections.observableArrayList();
  }

  public ObservableList<EventParticipantsViewModel> getList()
  {
    return list;
  }

  public ObservableList<EventParticipantsViewModel> update() //Code for event Table
  {
    ArrayList<User> participants = new ArrayList<>();
    for (int i = 0; i <model.getParticipantList().size(); i++)
    {
      participants.add(model.getParticipants(i));
    }
    list.clear();
    for (int j = 0; j< participants.size(); j++)
    {
      list.add(new EventParticipantsViewModel((BBCmodel) participants.get(j)));
    }
    return list;
  }

}

