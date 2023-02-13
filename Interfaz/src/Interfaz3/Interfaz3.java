package Interfaz3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Interfaz3 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Ventana3.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Tarea 3 Interfaz");
    stage.setScene(scene);
    stage.show();
  }
}
