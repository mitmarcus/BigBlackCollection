package view;

import javafx.beans.property.*;
import model.Reservation;

import java.time.LocalDate;

public class ReservationViewModel {
    private StringProperty reservationBorrowerProperty;
    private StringProperty reservationGameProperty;
    private ObjectProperty<LocalDate> reservationDateFromProperty;
    private ObjectProperty<LocalDate> reservationDateToProperty;

    public ReservationViewModel(Reservation reservation)
    {
        reservationBorrowerProperty = new SimpleStringProperty(reservation.lentTo().toString());
        reservationGameProperty = new SimpleStringProperty(reservation.getGame().toString());
        reservationDateFromProperty = new SimpleObjectProperty(reservation.getFromDate());
        reservationDateToProperty = new SimpleObjectProperty(reservation.getToDate());;
    }

    public StringProperty getReservationBorrowerProperty(){
        return reservationBorrowerProperty;
    }
    public StringProperty getReservationGameProperty()
    {
        return reservationGameProperty;
    }
    public ObjectProperty getReservationDateFromProperty()
    {
        return reservationDateFromProperty;
    }
    public ObjectProperty getReservationDateToProperty() {
        return reservationDateToProperty;
    }

}
