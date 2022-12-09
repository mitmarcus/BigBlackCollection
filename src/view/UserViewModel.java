package view;

import javafx.beans.property.*;
import model.User;

public class UserViewModel  //
  {
  private StringProperty firstNameProperty;
  private StringProperty lastNameProperty;
  private LongProperty phoneProperty;
  private StringProperty fullNameProperty;

  private StringProperty statusProperty;



  public UserViewModel(User user)
  {
  firstNameProperty = new SimpleStringProperty(user.getFirstName());
  lastNameProperty = new SimpleStringProperty(user.getLastName());
  phoneProperty = new SimpleLongProperty(user.getPhoneNumber());
  fullNameProperty = new SimpleStringProperty(user.getFirstName() +" " + user.getLastName());
    statusProperty = new SimpleStringProperty(user.getStatus());
  }


  public StringProperty getFirstNameProperty()
  {
    return firstNameProperty;
  }
  public StringProperty getLastNameProperty()
  {
    return lastNameProperty;
  }
  public LongProperty getPhoneProperty()
  {
    return phoneProperty;
  }
  public StringProperty getFullNameProperty()
  {
    return fullNameProperty;
  }

  public StringProperty getStatusProperty(){return statusProperty;}

}
