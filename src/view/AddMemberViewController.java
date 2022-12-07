package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.User;
import model.UserList;

public class AddMemberViewController //
  {
    private Region root;
    private BBCmodel model;
    private ViewHandler viewHandler;
    @FXML private TextField firstNameText;
    @FXML private TextField lastNameText;
    @FXML private TextField phoneText;



    public AddMemberViewController()
    {
      // Called by FXMLLoader
    }

    public void init(ViewHandler viewHandler, BBCmodel model, Region root)
    {
      this.model = model;
      this.viewHandler = viewHandler;
      this.root = root;



      reset();
    }
    public Region getRoot()
    {
      return root;
    }

    public void reset()
    {
      this.firstNameText.setText("");
      this.lastNameText.setText("");
      this.phoneText.setText("");
    }

    @FXML private void returnButtonPressed()
    {
      viewHandler.openView("member");
    }
    @FXML private void addMember()
    {
        User user = new User(firstNameText.getText(), lastNameText.getText(),
            Long.parseLong(phoneText.getText()), true);
        model.addUser(user);
        viewHandler.openView("member");


    }


}
