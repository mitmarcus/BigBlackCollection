package main;

import javafx.application.Application;
import javafx.stage.Stage;
import model.BBCmodel;
import model.BBCmodelManager;
import view.ViewHandler;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    BBCmodel model = new BBCmodelManager();
    ViewHandler view = new ViewHandler(model);
    view.start(primaryStage);
  }
}
