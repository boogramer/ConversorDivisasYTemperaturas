/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

/**
 *
 * @author ACER
 */
public class MenuPrincipalFXMLController implements Initializable {
    
    @FXML
    private StackPane menuPrincipal_SPane;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab bienvenido_tab;

    @FXML
    private Tab convDiv_tab;

    @FXML
    private ChoiceBox<String> monedaOr_cb;
    
    @FXML
    private TextField monedaOr_tf;
    
    @FXML
    private ChoiceBox<String> monedaDes_cb;

    @FXML
    private TextField monedaDes_tf;

    @FXML
    private Tab convTemp_tab;
    //el error era por la referncia del paquete en el archivo FXML
    private String[] monedas = {"PEN S/. - Nuevo Sol Peruano", "USD $ - Dólar Estadounidense", "EUR € - Euro", "JYP ¥ - Yen Japonés", "KRW ₩ - Won Surcoreano", "GBP £ - Libra Esterlina"};
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        monedaOr_cb.getItems().addAll(monedas);
        monedaOr_cb.setValue("PEN S/. - Nuevo Sol Peruano");
        monedaDes_cb.getItems().addAll(monedas);
        monedaDes_cb.setValue("USD $ - Dólar Estadounidense");
    }    
    
}
