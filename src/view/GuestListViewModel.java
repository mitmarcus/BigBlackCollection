package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.User;

import java.util.ArrayList;

public class GuestListViewModel
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
    ArrayList<User> users = new ArrayList<>();
    for (int i = 0; i <model.getGuestListSize(); i++)
    {
      users.add(model.getGuestByIndex(i));
    }
    list.clear();
    for (int j = 0; j< users.size(); j++)
    {
      list.add(new GuestViewModel(users.get(j)));
    }
    return list;
  }




  public void remove(User user)
  {
    for (int i = 0; i <list.size(); i++)
    {
      if (list.get(i).getFullNameProperty().get().equals(user.getFullName()) && (Long)list.get(i).getPhoneProperty().get()== user.getPhoneNumber())
      {
        list.remove(i);
        break;
      }
    }
  }

  public void add(User user)
  {
    list.add(new GuestViewModel(user));
  }




}
