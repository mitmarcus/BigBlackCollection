package view;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Player;

public class GuestViewModel   //
  {
  private StringProperty firstNameProperty;
  private StringProperty lastNameProperty;
  private LongProperty phoneProperty;
  private StringProperty fullNameProperty;



  public GuestViewModel(Player player)
  {
  firstNameProperty = new SimpleStringProperty(player.getFirstName());
  lastNameProperty = new SimpleStringProperty(player.getLastName());
  phoneProperty = new SimpleLongProperty(player.getPhoneNumber());
  fullNameProperty = new SimpleStringProperty(player.getFirstName() +" " + player.getLastName());
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
