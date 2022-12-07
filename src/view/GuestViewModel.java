package view;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.User;

public class GuestViewModel   //
  {
  private StringProperty firstNameProperty;
  private StringProperty lastNameProperty;
  private LongProperty phoneProperty;
  private StringProperty fullNameProperty;



  public GuestViewModel(User user)
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
