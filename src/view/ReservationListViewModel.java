package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.GameReservation;

import java.util.ArrayList;

public class ReservationListViewModel {
    private ObservableList<ReservationViewModel> list;
    private BBCmodel model;

    public ReservationListViewModel(BBCmodel model)
    {
        this.model = model;
        list = FXCollections.observableArrayList();
    }
    public ObservableList<ReservationViewModel> getList()
    {
        return list;
    }
    public ObservableList<ReservationViewModel> update()
    {
        ArrayList<GameReservation> reservation = new ArrayList<>();
        for (int i = 0; i <model.getReservationListSize(); i++)
        {
            reservation.add(model.getReservation(i));
        }
        list.clear();
//        for (int j = 0; j< reservation.size(); j++)
//        {
//            list.add(new ReservationViewModel(reservation.get(j)));
//        }
        return list;
    }

    public void remove(GameReservation reservation)
    {
        for (int i = 0; i <list.size(); i++)
        {
            if (list.get(i).getReservationBorrowerProperty().equals(reservation.lentTo()) &&
                    list.get(i).getReservationGameProperty().equals(reservation.getGame()) &&
                    list.get(i).getReservationDateFromProperty().equals(reservation.getFromDate()) &&
                    list.get(i).getReservationDateToProperty().equals(reservation.getToDate()))
            {
                list.remove(i);
                break;
            }
        }
    }
    public void add(GameReservation reservation)
    {
        list.add(new ReservationViewModel(reservation));
    }
}
