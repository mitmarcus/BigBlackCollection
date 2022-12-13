package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.BBCmodel;
import model.Reservation;

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
        ArrayList<Reservation> reservation = new ArrayList<>();
        for (int i = 0; i <model.getReservationListSize(); i++)
        {
            reservation.add(model.getReservationByIndex(i));
        }
        list.clear();
        for (int j = 0; j< reservation.size(); j++)
        {
            list.add(new ReservationViewModel(reservation.get(j)));
        }
        return list;
    }

    public void remove(Reservation reservation)
    {
        for (int i = 0; i <list.size(); i++)
        {
            if (list.get(i).equals(reservation))
            {
                list.remove(i);
                break;
            }
        }
    }
    public void add(Reservation reservation)
    {
        list.add(new ReservationViewModel(reservation));
    }
}
