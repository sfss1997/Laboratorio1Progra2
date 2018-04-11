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
import tarea3programacion2.Frutas;

/**
 *
 * @author fabian
 */
public class FXMLDocumentController implements Initializable {
    
    public static ObservableList<Frutas> listaFrutas = FXCollections.observableArrayList();
    
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox fruta1ComboBox ;
    
    @FXML
    private ComboBox fruta2ComboBox ;
    
    @FXML
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        llenarLista();
        llenarComboBox();
    }    

    private void llenarLista() {
        
        listaFrutas.add(Frutas.Pera);
        listaFrutas.add(Frutas.Manzana);
        listaFrutas.add(Frutas.Melón);
        listaFrutas.add(Frutas.Naranja);
        listaFrutas.add(Frutas.Limón);
    }

    private void llenarComboBox() {
      
        for (int i = 0; i < listaFrutas.size(); i++) {
            fruta1ComboBox.getItems().add(listaFrutas.get(i));
            fruta2ComboBox.getItems().add(listaFrutas.get(i));
        }
    }
    
    public void sumaButton(){
    
        if(fruta1ComboBox.getValue().equals(Frutas.Pera) &&fruta2ComboBox.getValue().equals(Frutas.Pera)){
            label.setText(Frutas.Pera.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Pera)&&fruta2ComboBox.getValue().equals(Frutas.Manzana)){
            label.setText(Frutas.Melón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Pera)&&fruta2ComboBox.getValue().equals(Frutas.Limón)){
            label.setText(Frutas.Naranja.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Pera)&&fruta2ComboBox.getValue().equals(Frutas.Melón)){
            label.setText(Frutas.Limón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Pera)&&fruta2ComboBox.getValue().equals(Frutas.Naranja)){
            label.setText(Frutas.Manzana.toString());
        }
        
        
        
        if(fruta1ComboBox.getValue().equals(Frutas.Manzana) &&fruta2ComboBox.getValue().equals(Frutas.Pera)){
            label.setText(Frutas.Melón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Manzana)&&fruta2ComboBox.getValue().equals(Frutas.Manzana)){
            label.setText(Frutas.Manzana.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Manzana)&&fruta2ComboBox.getValue().equals(Frutas.Limón)){
            label.setText(Frutas.Naranja.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Manzana)&&fruta2ComboBox.getValue().equals(Frutas.Melón)){
            label.setText(Frutas.Limón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Manzana)&&fruta2ComboBox.getValue().equals(Frutas.Naranja)){
            label.setText(Frutas.Pera.toString());
        }
        
        
        
        if(fruta1ComboBox.getValue().equals(Frutas.Limón) &&fruta2ComboBox.getValue().equals(Frutas.Pera)){
            label.setText(Frutas.Naranja.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Limón)&&fruta2ComboBox.getValue().equals(Frutas.Manzana)){
            label.setText(Frutas.Pera.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Limón)&&fruta2ComboBox.getValue().equals(Frutas.Limón)){
            label.setText(Frutas.Limón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Limón)&&fruta2ComboBox.getValue().equals(Frutas.Melón)){
            label.setText(Frutas.Manzana.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Limón)&&fruta2ComboBox.getValue().equals(Frutas.Naranja)){
            label.setText(Frutas.Melón.toString());
        }
        
        
        
        if(fruta1ComboBox.getValue().equals(Frutas.Melón) &&fruta2ComboBox.getValue().equals(Frutas.Pera)){
            label.setText(Frutas.Manzana.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Melón)&&fruta2ComboBox.getValue().equals(Frutas.Manzana)){
            label.setText(Frutas.Pera.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Melón)&&fruta2ComboBox.getValue().equals(Frutas.Limón)){
            label.setText(Frutas.Naranja.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Melón)&&fruta2ComboBox.getValue().equals(Frutas.Melón)){
            label.setText(Frutas.Melón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Melón)&&fruta2ComboBox.getValue().equals(Frutas.Naranja)){
            label.setText(Frutas.Limón.toString());
        }
        
        
         if(fruta1ComboBox.getValue().equals(Frutas.Naranja) &&fruta2ComboBox.getValue().equals(Frutas.Pera)){
            label.setText(Frutas.Limón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Naranja)&&fruta2ComboBox.getValue().equals(Frutas.Manzana)){
            label.setText(Frutas.Melón.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Naranja)&&fruta2ComboBox.getValue().equals(Frutas.Limón)){
            label.setText(Frutas.Pera.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Naranja)&&fruta2ComboBox.getValue().equals(Frutas.Melón)){
            label.setText(Frutas.Manzana.toString());
        }
        if(fruta1ComboBox.getValue().equals(Frutas.Naranja)&&fruta2ComboBox.getValue().equals(Frutas.Naranja)){
            label.setText(Frutas.Naranja.toString());
        }
        
        
        
        
     
        
        
        
        
        
        
       
        
        
        
       
        
        
       
        
//        label.setText(value);
    }
    
}
