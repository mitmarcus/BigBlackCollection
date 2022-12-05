package view;

import javafx.beans.property.*;
import model.User;

public class UserViewModel
  {
  private StringProperty firstNameProperty;
  private StringProperty lastNameProperty;
  private LongProperty phoneProperty;
  private StringProperty fullNameProperty;



  public UserViewModel(User user)
  {
  firstNameProperty = new SimpleStringProperty(user.getFirstName());
  lastNameProperty = new SimpleStringProperty(user.getLastName());
  phoneProperty = new SimpleLongProperty(user.getPhoneNumber());
  fullNameProperty = new SimpleStringProperty(user.getFirstName() +" " + user.getLastName());
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

}
