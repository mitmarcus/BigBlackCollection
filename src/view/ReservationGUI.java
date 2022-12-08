package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Game;
import model.GameReservation;
import model.User;


public class ReservationGUI
{

  private BBCmodel model;
  private ViewHandler viewHandler;
  private Region root;
    public ReservationGUI() {
        // Called by FXMLLoader
    }

    public void init(ViewHandler viewHandler, BBCmodel model, Region root) {
        this.model = model;
        this.viewHandler = viewHandler;
        this.root = root;


        reset();
 }

//    public void initialize()
//    {
//        ????
//        modelManager = new ModelManager("reservations.bin");
//
//        updateGamesForReservationBox();
//        updateReservationBox();
//
//    }

    public Region getRoot() {
        return root;
    }

    public void reset() {
    }

    @FXML
    private void goBack() {
        viewHandler.openView("main");
    }


    @FXML
    private Tab reservationsTab;
    @FXML
    private TabPane reservationsTabPane;

    // addReservation
    @FXML
    private Tab addReservationTab;
    @FXML
    private ComboBox<User> addReservationMember;
    @FXML
    private ComboBox<Game> addReservationGame;
    @FXML
    private DatePicker addReservationSDate;
    @FXML
    private TextField addReservationSHour;
    @FXML
    private TextField addReservationSMinute;
    @FXML
    private DatePicker addReservationEDate;
    @FXML
    private TextField addReservationEHour;
    @FXML
    private TextField addReservationEMinute;
    @FXML
    private Button addReservationConfirm;



    // manageReservations
    @FXML
    private Tab manageReservationsTab;
    @FXML
    private ComboBox<GameReservation> reservationsListTab;
    @FXML
    private Label manageReservationsMember;
    @FXML
    private Label manageReservationsGame;
    @FXML
    private Label manageReservationsSDate;
    @FXML
    private Label manageReservationsEDate;
    @FXML
    private Button manageReservationsEnd;
    @FXML
    private Button manageReservationsToBorrowing;
    @FXML
    private TextField manageReservationsLocation;


}

