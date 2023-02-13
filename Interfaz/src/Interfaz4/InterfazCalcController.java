
package Interfaz4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class InterfazCalcController implements Initializable {

  @FXML
  private TextArea Textoresul;
  @FXML
  private Button boton1;
  @FXML
  private Button boton4;
  @FXML
  private Button boton2;
  @FXML
  private Button boton7;
  @FXML
  private Button boton3;
  @FXML
  private Button boton8;
  @FXML
  private Button boton5;
  @FXML
  private Button boton9;
  @FXML
  private Button boton6;
  @FXML
  private Button botonborrado;
  @FXML
  private Button boton0;
  @FXML
  private Button botonresul;
  @FXML
  private Button botonsuma;
  @FXML
  private Button botondivision;
  @FXML
  private Button botonmulti;
  @FXML
  private Button botonresta;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    
  }  

  @FXML
  private void pone1(ActionEvent event) {
   
    Textoresul.setText("1");
  }

  @FXML
  private void pone4(ActionEvent event) {
    Textoresul.setText("4");
  }

  @FXML
  private void pone2(ActionEvent event) {
    Textoresul.setText("2");
  }

  @FXML
  private void pone7(ActionEvent event) {
    Textoresul.setText("7");
  }

  @FXML
  private void pone3(ActionEvent event) {
    Textoresul.setText("3");
  }

  @FXML
  private void pone8(ActionEvent event) {
    Textoresul.setText("8");
  }

  @FXML
  private void pone5(ActionEvent event) {
    Textoresul.setText("5");
  }

  @FXML
  private void pone9(ActionEvent event) {
    Textoresul.setText("9");
  }

  @FXML
  private void pone6(ActionEvent event) {
    Textoresul.setText("6");
  }

  @FXML
  private void limpia(ActionEvent event) {
    Textoresul.clear();
  }

  @FXML
  private void pone0(ActionEvent event) {
    Textoresul.setText("0");
  }

  @FXML
  private void resultado(ActionEvent event) {
  }

  @FXML
  private void suma(ActionEvent event) {
    Textoresul.setText("+");
  }

  @FXML
  private void divide(ActionEvent event) {
    Textoresul.setText("/");
  }

  @FXML
  private void multi(ActionEvent event) {
    Textoresul.setText("*");
  }

  @FXML
  private void resta(ActionEvent event) {
    Textoresul.setText("-");
  }
  
}
