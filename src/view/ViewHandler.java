package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.BBCmodel;

public class ViewHandler
{

  private Region root;
  private Scene currentScene;
  private Stage primaryStage;
  private BBCmodel model;
  private MainWindowViewController mainWindowViewController;
  private UserViewController userViewController;
  private ShowMembersListViewController showMembersListViewController;
  private AddMemberViewController addMemberViewController;
  private AddGuestViewController addGuestViewController;
  private ShowGuestsListViewController showGuestsListViewController;
  private ShowAllGamesViewController  showAllGamesViewController;
  private AddNewGameViewController addNewGameViewController;

  private EditMemberViewController editMemberViewController;

  private ShowEventListViewController showEventListViewController;


  public ViewHandler(BBCmodel model)
  {
    this.model = model;
    this.currentScene = new Scene(new Region());
  }

  public void openView(String id)
  {
    Region root = null;

    switch (id)
    {
      case "main":
        root = loadMainWindowViewController("MainWindowViewController.fxml");
        break;
      case "users":
        root = loadUsersWindowViewController("UserViewController.fxml");
        break;
      case "member":
        root = loadMemberListWindowViewController("ShowMembersListViewController.fxml");
        break;
      case "addMember":
        root = loadAddMemberViewController("AddMemberViewController.fxml");
        break;
      case "guest":
        root = loadShowGuestViewController("ShowGuestsListViewController.fxml");
        break;
      case "addGuest":
        root = loadAddGuestViewController("AddGuestViewController.fxml");
        break;
      case "games" :
        root = loadGamesWindowViewController("ShowAllGamesViewController.fxml");
        break;
      case "editMember" :
        root = loadEditMemberViewController("EditMemberViewController.fxml");
        break;
      case "addGame" :
        root = loadAddGameViewController("AddNewGameViewController.fxml");
        break;
      case "events" :
        root = loadShowEventListViewController("ShowEventListViewController.fxml");
        break;
    }
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
    currentScene.setRoot(root);
    primaryStage.show();
  }



  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("main");
  }
  public void closeView()
  {
      primaryStage.close();
  }



  private Region loadMainWindowViewController(String fxmlFile)
  {
    if(mainWindowViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        mainWindowViewController = loader.getController();
        mainWindowViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      mainWindowViewController.reset();
    }
    return mainWindowViewController.getRoot();
  }

  private Region loadUsersWindowViewController(String fxmlFile)
  {
    if(userViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        userViewController = loader.getController();
        userViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      userViewController.reset();
    }
    return userViewController.getRoot();
  }
  private Region loadMemberListWindowViewController(String fxmlFile)
  {
    if(showMembersListViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        showMembersListViewController = loader.getController();
        showMembersListViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      showMembersListViewController.reset();
    }
    return showMembersListViewController.getRoot();
  }
  private Region loadShowGuestViewController(String fxmlFile)
  {
    if(showGuestsListViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        showGuestsListViewController = loader.getController();
        showGuestsListViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      showGuestsListViewController.reset();
    }
    return showGuestsListViewController.getRoot();
  }
  private Region loadAddMemberViewController(String fxmlFile)
  {
    if(addMemberViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        addMemberViewController = loader.getController();
        addMemberViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      addMemberViewController.reset();
    }
    return addMemberViewController.getRoot();
  }


  private Region loadAddGuestViewController(String fxmlFile)
  {
    if(addGuestViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        addGuestViewController = loader.getController();
        addGuestViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      addGuestViewController.reset();
    }
    return addGuestViewController.getRoot();
  }

  private Region loadGamesWindowViewController(String fxmlFile)
  {
    if(showAllGamesViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        showAllGamesViewController = loader.getController();
        showAllGamesViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      showAllGamesViewController.reset();
    }
    return showAllGamesViewController.getRoot();
  }
  private Region loadEditMemberViewController(String fxmlFile)
  {
    if(editMemberViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        editMemberViewController = loader.getController();
        editMemberViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      editMemberViewController.reset();
    }
    return editMemberViewController.getRoot();
  }

  private Region loadAddGameViewController(String fxmlFile)
  {
    if(addNewGameViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        addNewGameViewController = loader.getController();
        addNewGameViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      addNewGameViewController.reset();
    }
    return addNewGameViewController.getRoot();
  }

  private Region loadShowEventListViewController(String fxmlFile)
  {
    if(showEventListViewController == null)


      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        showEventListViewController = loader.getController();
        showEventListViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    else
    {
      showEventListViewController.reset();
    }
    return showEventListViewController.getRoot();
  }
}