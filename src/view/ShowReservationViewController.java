package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.BBCmodel;
import model.Event;

import java.util.Optional;

public class ShowReservationViewController
{
    private Region root;
    private BBCmodel model;
    private ViewHandler viewHandler;
    private EventListViewModel viewModel;

    @FXML private TableView<ReservationViewModel> reservationListTable;
    @FXML private TableColumn<ReservationViewModel, String> borrower;
    @FXML private TableColumn<ReservationViewModel, String> game;
    @FXML private TableColumn<ReservationViewModel, DatePicker> fromDate;
    @FXML private TableColumn<ReservationViewModel, String> toDate;

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
                cellData -> cellData.getValue().getReservationNameProperty());
        game.setCellValueFactory(
                cellData -> cellData.getValue().getEventPlaceProperty());
        fromDate.setCellValueFactory(
                cellData -> cellData.getValue().getEventDateProperty());
        toDate.setCellValueFactory(
                cellData -> cellData.getValue().getEventDescriptionProperty());
        reservationListTable.setItems(viewModel.getList());
        viewModel.update();
    }

    public Region getRoot()
    {
        return root;
    }
    public void reset() {
        viewModel.update();
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
            Event event = new Event(selectedItem.getEventNameProperty().get(),
                    selectedItem.getEventPlaceProperty().get(),
                    selectedItem.getEventDescriptionProperty().get());


            model.removeEvent(event);
            viewModel.remove(event);
            reservationListTable.getSelectionModel().clearSelection();


        }
    }

    private boolean confirmation()
    {
        int index;
        index = reservationListTable.getSelectionModel().getSelectedIndex();
        EventViewModel selectedItem = reservationListTable.getItems().get(index);
        if (index < 0 || index >= reservationListTable.getItems().size())
        {
            return false;
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(
                "Removing user {" + selectedItem.getEventNameProperty().get() + "}");
        Optional<ButtonType> result = alert.showAndWait();
        return ((result.isPresent()) && (result.get() == ButtonType.OK)) ;
    }
    
}


