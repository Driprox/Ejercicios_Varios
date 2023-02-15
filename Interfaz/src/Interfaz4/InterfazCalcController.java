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
  private Button botonpunto;
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
  private float numero1;
  private float numero2;
  private String signo;

  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }

  @FXML
  private void pone1(ActionEvent event) {

    Textoresul.setText(Textoresul.getText() + "1");
  }

  @FXML
  private void ponepunto(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + ".");
  }

  @FXML
  private void pone4(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "4");
  }

  @FXML
  private void pone2(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "2");
  }

  @FXML
  private void pone7(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "7");
  }

  @FXML
  private void pone3(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "3");
  }

  @FXML
  private void pone8(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "8");
  }

  @FXML
  private void pone5(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "5");
  }

  @FXML
  private void pone9(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "9");
  }

  @FXML
  private void pone6(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "6");
  }

  @FXML
  private void limpia(ActionEvent event) {
    Textoresul.clear();
  }

  @FXML
  private void pone0(ActionEvent event) {
    Textoresul.setText(Textoresul.getText() + "0");
  }

  @FXML
  private void resultado(ActionEvent event) {
    numero2 = Integer.parseInt(Textoresul.getText());
    int resultado;
    switch (signo) {
      case "+":
        Textoresul.setText(Float.toString(numero1 + numero2));
        break;
      case "-":
        Textoresul.setText(Float.toString(numero1 - numero2));
        break;
      case "*":
        Textoresul.setText(Float.toString(numero1 * numero2));
        break;
      case "/":
        Textoresul.setText(Float.toString(numero1 / numero2));
    }
  }

  @FXML
  private void suma(ActionEvent event) {
    numero1 = Float.parseFloat(Textoresul.getText());
    signo = "+";
    Textoresul.setText("");
  }

  @FXML
  private void divide(ActionEvent event) {
    numero1 = Float.parseFloat(Textoresul.getText());
    signo = "/";
    Textoresul.setText("");
  }

  @FXML
  private void multi(ActionEvent event) {
    Textoresul.setText("*");
    numero1 = Float.parseFloat(Textoresul.getText());
    signo = "*";
    Textoresul.setText("");
  }

  @FXML
  private void resta(ActionEvent event) {
    Textoresul.setText("-");
    numero1 = Float.parseFloat(Textoresul.getText());
    signo = "-";
    Textoresul.setText("");
  }

}
