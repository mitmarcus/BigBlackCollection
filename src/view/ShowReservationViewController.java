package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Reservation;

import java.util.Optional;

public class ShowReservationViewController
{
    private Region root;
    private BBCmodel model;
    private ViewHandler viewHandler;
    private ReservationListViewModel viewModel;

    @FXML private TableView<ReservationViewModel> reservationListTable;
    @FXML private TableColumn<ReservationViewModel, String> borrower;
    @FXML private TableColumn<ReservationViewModel, String> game;
    @FXML private TableColumn<ReservationViewModel, DatePicker> fromDate;
    @FXML private TableColumn<ReservationViewModel, DatePicker> toDate;

    public ShowReservationViewController()
    {
        // Called by FXMLLoader
    }

    public void init(ViewHandler viewHandler, BBCmodel model, Region root)
    {
        this.model = model;
        this.viewHandler = viewHandler;
        this.root = root;
        this.viewModel = new ReservationListViewModel(model);

        borrower.setCellValueFactory(
                cellData -> cellData.getValue().getReservationBorrowerProperty());
        game.setCellValueFactory(
                cellData -> cellData.getValue().getReservationGameProperty());
        fromDate.setCellValueFactory(
                cellData -> cellData.getValue().getReservationDateFromProperty());
        toDate.setCellValueFactory(
                cellData -> cellData.getValue().getReservationDateToProperty());
        reservationListTable.setItems(viewModel.getList());
        reset();
    }

    public Region getRoot()
    {
        return root;
    }
    public void reset() {
        reservationListTable.setItems(viewModel.update());
    }

    @FXML private void goBack()
    {
        viewHandler.openView("main");
    }
    @FXML private void createAReservation()
    {
        viewHandler.openView("createAReservation");
    }
    @FXML private void removeReservation()
    {

        ReservationViewModel selectedItem = reservationListTable.getSelectionModel().getSelectedItem();

        boolean remove = confirmation();

        if (remove)
        {
            Reservation reservation = new Reservation(selectedItem.getReservationBorrowerProperty().get(),
                    selectedItem.getReservationGameProperty().get(),
                    selectedItem.getReservationDateFromProperty().get(), selectedItem.getReservationDateToProperty().get());


            model.removeReservation(reservation);
            viewModel.remove(reservation);
            reservationListTable.getSelectionModel().clearSelection();
            viewModel.update();


        }
    }

    private boolean confirmation()
    {
        int index;
        index = reservationListTable.getSelectionModel().getSelectedIndex();
        ReservationViewModel selectedItem = reservationListTable.getItems().get(index);
        if (index < 0 || index >= reservationListTable.getItems().size())
        {
            return false;
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(
                "Removing user {" + selectedItem.getReservationBorrowerProperty().get() + "}");
        Optional<ButtonType> result = alert.showAndWait();
        return ((result.isPresent()) && (result.get() == ButtonType.OK)) ;
    }
    
}


