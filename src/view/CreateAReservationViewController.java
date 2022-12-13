package view;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.*;

public class CreateAReservationViewController
{
    private Region root;
    private BBCmodel model;
    private ViewHandler viewHandler;

    @FXML private TextField reservationBorrower;
    @FXML private TextField reservationGame;
    @FXML private DatePicker reservationDateFrom;
    @FXML private DatePicker reservationDateTo;

    public CreateAReservationViewController()
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
        this.reservationBorrower.setText("");
        this.reservationGame.setText("");
    }

    @FXML private void returnButtonPressed()
    {
        viewHandler.openView("reservations");
    }

    @FXML private void createAReservation()
    {
        Reservation reservation = new Reservation(reservationBorrower.getText(), reservationGame.getText(), reservationDateFrom.getValue(),
                reservationDateTo.getValue());
        model.addReservation(reservation);
        viewHandler.openView("reservations");
    }
}