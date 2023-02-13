package Interfaz3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Ventana3Controller implements Initializable {

  @FXML
  private Button boton1;
  @FXML
  private Label etiqueta;

  @FXML
  private void pulsar(ActionEvent event) {
    etiqueta.setText("Hola");
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }

}
