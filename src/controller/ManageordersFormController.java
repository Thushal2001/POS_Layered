package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ManageordersFormController {

    @FXML
    private AnchorPane root;
    @FXML
    private JFXComboBox cmbCustomerId;
    @FXML
    private JFXTextField txtCustomerName;
    @FXML
    private JFXComboBox cmbItemCode;
    @FXML
    private JFXTextField txtDescription;
    @FXML
    private JFXTextField txtQtyOnHand;
    @FXML
    private JFXTextField txtUnitPrice;
    @FXML
    private JFXTextField txtQty;
    @FXML
    private JFXButton btnSave;
    @FXML
    private JFXButton btnPlaceOrder;
    @FXML
    private TableView tblOrderDetails;
    @FXML
    private Label lblId;
    @FXML
    private Label lblDate;
    @FXML
    private Label lblTotal;

    @FXML
    private void txtQtyOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void btnAddToCartOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void btnPlaceOrderOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void navigateToHome(MouseEvent event) {

    }
}
