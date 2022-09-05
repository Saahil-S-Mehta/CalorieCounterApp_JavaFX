package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Final {
    @FXML
    private Text calcval,bmival;
    @FXML
    private Button logoutbtn;
    public void SetCalories(int cal) {

        calcval.setText(""+ cal);
    }
    public void SetBMI(double bmivalue) {

        bmival.setText(""+ bmivalue);
    }


    public void Logout(javafx.event.ActionEvent event) throws IOException {
        Parent sceneparent1 = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene childscene1 = new Scene(sceneparent1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Login");
        window.setScene(childscene1);
        window.show();
    }
}
