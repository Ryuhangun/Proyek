/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.penjualan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FXMLInputBrgController implements Initializable {

    @FXML
    private TextField txtkodebrg;
    @FXML
    private TextField txtnamabrg;
    @FXML
    private TextField txttarif;
    @FXML
    private Button btnsimpan;
    @FXML
    private Button btnbatal;
    @FXML
    private Button btnkeluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnsimpanklik(ActionEvent event) {
    }

    @FXML
    private void btnbatalklik(ActionEvent event) {
    }

    @FXML
    private void btnkeluarklik(ActionEvent event) {
    }
    
}
