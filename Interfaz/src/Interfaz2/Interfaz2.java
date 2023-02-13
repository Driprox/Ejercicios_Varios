package Interfaz2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Interfaz2 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Ventana2.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Esto es una prueba para la tarea 2");
    stage.setScene(scene);
    stage.show();
  }
}
