package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.Event;

import java.util.ArrayList;

public class EventListViewModel  //
{
  private ObservableList<EventViewModel> list;
  private BBCmodel model;

  public EventListViewModel(BBCmodel model)
  {
    this.model = model;
    list = FXCollections.observableArrayList();
  }
  public ObservableList<EventViewModel> getList()
  {
    return list;
  }
  public ObservableList<EventViewModel> update() //Code for event Table
  {
    ArrayList<Event> events = new ArrayList<>();
    for (int i = 0; i <model.getEventListSize(); i++)
    {
      events.add(model.getEventByIndex(i));
    }
    list.clear();
    for (int j = 0; j< events.size(); j++)
   {
     list.add(new EventViewModel(events.get(j)));
    }
    return list;
  }

  public void remove(Event event)
  {
    for (int i = 0; i <list.size(); i++)
    {
      if (list.get(i).equals(event))
      {
        list.remove(i);
        break;
      }
    }
  }
  public void add(Event event)
  {
    list.add(new EventViewModel(event));
  }
}
