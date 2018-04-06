/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3programacion2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author fabian
 */
public class FXMLDocumentController implements Initializable {
    
    public static ObservableList<String> listaFrutas = FXCollections.observableArrayList();
    
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox fruta1ComboBox ;
    
    @FXML
    private ComboBox fruta2ComboBox ;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        llenarLista();
        llenarComboBox();
    }    

    private void llenarLista() {
        listaFrutas.add("manzana");
        listaFrutas.add("pera");
        listaFrutas.add("limón");
        listaFrutas.add("melón");
        listaFrutas.add("naranja");
    }

    private void llenarComboBox() {
      
        for (int i = 0; i < listaFrutas.size(); i++) {
            fruta1ComboBox.getItems().add(listaFrutas.get(i));
            fruta2ComboBox.getItems().add(listaFrutas.get(i));
        }
    }
    
    public void sumaButton(){
    
    }
    public void restaButton(){
    
    }
}
