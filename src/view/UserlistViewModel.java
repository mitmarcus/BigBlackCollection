package view;
import model.User;
import model.BBCmodel;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;

public class UserlistViewModel
{
  private ObservableList<UserViewModel> list;

  private BBCmodel model;

  public UserlistViewModel(BBCmodel model)
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
    ArrayList<User> users = new ArrayList<>();
    for (int i = 0; i <model.getUserListSize(); i++)
    {
      users.add(model.getUser(i));
    }
    list.clear();
    for (int j = 0; j< users.size(); j++)
    {
      list.add(new UserViewModel(users.get(j)));
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
    list.add(new UserViewModel(user));
  }





}
