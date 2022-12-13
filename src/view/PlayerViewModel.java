package view;

import javafx.beans.property.*;
import model.Player;

public class PlayerViewModel  //
  {
  private StringProperty firstNameProperty;
  private StringProperty lastNameProperty;
  private LongProperty phoneProperty;
  private StringProperty fullNameProperty;
  private StringProperty statusProperty;



  public PlayerViewModel(Player player)
  {
  firstNameProperty = new SimpleStringProperty(player.getFirstName());
  lastNameProperty = new SimpleStringProperty(player.getLastName());
  phoneProperty = new SimpleLongProperty(player.getPhoneNumber());
  fullNameProperty = new SimpleStringProperty(player.getFirstName() +" " + player.getLastName());
  statusProperty = new SimpleStringProperty(player.getStatus());
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
