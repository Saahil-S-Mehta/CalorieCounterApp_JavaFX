package sample;
import java.lang.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
  static String[][] arr =new String[10][6];


 private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage= primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 424, 407));
        primaryStage.show();
    }

  public void initarr(){
        arr[0][0]="Akshay";
        arr[0][1]="21";
        arr[0][2]="175";
        arr[0][3]="75";
        arr[0][4]="akshay";
        arr[0][5]="pwd";
      arr[1][0]="Suraj";
      arr[1][1]="21";
      arr[1][2]="168";
      arr[1][3]="50";
      arr[1][4]="surajkr";
      arr[1][5]="hey";
    }
    void updatearr(int key, String item1,String item2,String item3,String item4,String item5,String item6){
        arr[key][0]=item1;
        arr[key][1]=item2;
        arr[key][2]=item3;
        arr[key][3]=item4;
        arr[key][4]=item5;
        arr[key][5]=item6;
    }
    public static void main(String[] args) {

      Main m = new Main();
       m.initarr();
      //  m.display();
        try {
            launch(args);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
