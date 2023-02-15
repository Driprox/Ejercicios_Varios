package Interfaz4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("InterfazCalc.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Calculadora");
    stage.setScene(scene);
    stage.show();
  }
}
