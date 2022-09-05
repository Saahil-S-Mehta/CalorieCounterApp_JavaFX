package sample;
import java.io.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.regex.*;


public class NewUser extends Main{

    @FXML
    private TextField name,age,height,weight,username;
    @FXML
    private PasswordField pwd;
    @FXML
    private Button nextbutton;
    @FXML
    private Label prompt;


    public void backtologin(ActionEvent event)throws IOException{
        initarr();
        String uname= name.getText();
        String user_age= age.getText();
        String user_height= height.getText();
        String user_weight=weight.getText();
        String user_id=username.getText();
        String user_pwd=pwd.getText();

        int i,key=0;
        boolean flag=false;
        for(i=0;i<10;i++){
            if(arr[i][0]==null){
                key=i;
                break;}}
        System.out.println("key ="+key);


        for(i=0;i<key;i++){
            if(arr[i][4].equals( user_id)){
                flag=false;
                prompt.setText("Username already exists. Please choose a new one");
            }
        }

        boolean b =Pattern.matches("[A-Za-z0-9]+",user_id);
        if(b==true)
        {
            flag = true;
        }
        else{
            prompt.setText("Username cannot have Special Characters");
            flag=false;

        }
        boolean c =Pattern.matches("[0-9]+",user_age);
        if(c==false){
            flag=false;
            prompt.setText("Age must be Numeric");
        }
        boolean d =Pattern.matches("[0-9]+",user_height);
        if(d==false){
            flag=false;
            prompt.setText("Height must be Numeric");
        }
        boolean e =Pattern.matches("[0-9]+",user_weight);
        if(e==false){
            flag=false;
            prompt.setText("Weight must be Numeric");
        }
        boolean f =Pattern.matches("[A-Za-z]+",uname);
        if(f==false){
            flag=false;
            prompt.setText("Name must Comprise a-z A-z");
        }
        if(flag==true) {
            updatearr(key, uname, user_age, user_height, user_weight, user_id, user_pwd);
            arr[key][0]=uname;
            arr[key][1]=user_age;
            arr[key][2]=user_height;
            arr[key][3]=user_weight;
            arr[key][4]=user_id;
            arr[key][5]=user_pwd;
            prompt.setText("Account Created ! Please Login.");
            Parent sceneparent1 = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene childscene1 = new Scene(sceneparent1);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setTitle("Login");
            window.setScene(childscene1);
            window.show();

        }
    }
}


