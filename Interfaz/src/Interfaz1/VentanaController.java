package Interfaz1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.shape.Polygon;

public class VentanaController implements Initializable {

    @FXML
    private Button btnBoton;
    @FXML
    private Hyperlink etiueta;
    @FXML
    private Polygon figura;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void click(ActionEvent event) {
    }

}
