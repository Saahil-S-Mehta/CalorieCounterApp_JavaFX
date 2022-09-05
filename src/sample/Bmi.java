package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Bmi extends Login {
    @FXML
    private Button calcbtn;

   @FXML
   private Text tf;

   public void SetName(String name) {
    //  String name = arr[row][0];
       tf.setText(""+ name);
   }

    public void calcCal(ActionEvent event)throws IOException {
        Parent sceneparent1 = FXMLLoader.load(getClass().getResource("foodoptions.fxml"));
        Scene childscene1 = new Scene(sceneparent1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Pick Food Items");
        window.setScene(childscene1);
        window.show();
    }

}
