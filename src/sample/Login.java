package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import sample.NewUser;

import javafx.scene.Scene;

public class Login extends NewUser{

    @FXML
    private Button loginbutton;
    @FXML
    private Button newAccountbtn;
    @FXML
    private Button adminlogin;
    @FXML
    private TextField username;
    @FXML
    private Label wronglogin;
    @FXML
    private PasswordField password;
    private Parent root;
    private Stage stage;
    private Scene scene;

   static int row=0;
    public void userLogin(ActionEvent event) throws IOException {

        String d1=username.getText();
        String d2=password.getText();
        boolean flag=false;
       // int row=0;
        for(int i=0;i<10;i++) {
                if(d1.equals(arr[i][4])){
                    row=i;
                    flag=true;
                }
            }
        if(d2.equals(arr[row][5])){
            wronglogin.setText("Login Success");
            String name = arr[row][0];
            System.out.println(name);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("bmi.fxml"));
            root= loader.load();
            Bmi control=loader.getController();
            control.SetName(name);
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setTitle("BMI");
            stage.setScene(scene);
            stage.show();
        }


         if(username.getText().isEmpty() && password.getText().isEmpty()){
            wronglogin.setText("Please enter your Credentials");
        }
        else if(flag==false && !(username.getText().isEmpty())){
             wronglogin.setText("No User found. Create a new account.");
         }
        else{
            wronglogin.setText("Incorrect Password");
        }

    }
    public void newAccount(ActionEvent event)throws IOException {
        Parent sceneparent= FXMLLoader.load(getClass().getResource("newUser.fxml"));
        Scene childscene=new Scene(sceneparent);

        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Enter User Data");
        window.setScene(childscene);
        window.show();
    }
    public void adminLogin(ActionEvent event)throws IOException {
        Parent sceneparent= FXMLLoader.load(getClass().getResource("adminview.fxml"));
        Scene childscene=new Scene(sceneparent);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Admin View");
        window.setScene(childscene);
        window.show();
    }


}



