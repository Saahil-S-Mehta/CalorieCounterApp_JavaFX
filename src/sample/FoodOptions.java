package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

interface Calculate_Bmi{
    double calBmi(double height, int weight);
}
public class FoodOptions extends Login implements Initializable {
    int roti_qty=0,rice_qty=0,dal_qty=0,egg_qty=0,apple_qty=0,banana_qty=0,coffee_qty=0,dosa_qty=0,idli_qty=0;
    public String [] quantity= {"0","1","2","3","4"};
    int calrice=100,calroti=80,caldal=75,calapple=40,calbanana=60,caldosa=100,calidli=90,calegg=75,calcoffee=50;
    int totalcal=0;
    int height = Integer.parseInt(arr[row][2]);
    int weight = Integer.parseInt(arr[row][3]);
    double sqh= (height)/100.0;
    double bmi=0.0;
    @FXML
    private Button Roti;

    @FXML
    private ImageView Roti_img;
    public void setRoti_img(ImageView roti_img) {
        Roti_img = roti_img;
    }

    @FXML
    private ChoiceBox<String> Roti_ch;

    @FXML
    private Button Rice;

    @FXML
    private ImageView Rice_img;

    @FXML
    private ChoiceBox<String> Rice_ch;

    @FXML
    private Button Dal;

    @FXML
    private ImageView Dal_img;

    @FXML
    private ChoiceBox<String> Dal_ch;

    @FXML
    private Button Apple;

    @FXML
    private ImageView Apple_img;

    @FXML
    private ChoiceBox<String> Apple_ch;

    @FXML
    private Button Bannana;

    @FXML
    private ImageView Bannana_img;

    @FXML
    private ChoiceBox<String> Banana_ch;

    @FXML
    private Button Egg;

    @FXML
    private ImageView Egg_img;

    @FXML
    private ChoiceBox<String> Egg_ch;

    @FXML
    private Button Dosa;

    @FXML
    private Button Idli;

    @FXML
    private Button Coffee;

    @FXML
    private ChoiceBox<String> Dosa_ch;

    @FXML
    private ChoiceBox<String> Idli_ch;

    @FXML
    private ChoiceBox<String> Coffee_ch;

    @FXML
    private ImageView Dosa_img;

    @FXML
    private ImageView Idli_img;

    @FXML
    private ImageView Coffee_img;

    @FXML
    private Button Cal;
    private Parent root;
    private Stage stage;
    private Scene scene;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Roti_ch.getItems().addAll(quantity);
        Rice_ch.getItems().addAll(quantity);
        Dal_ch.getItems().addAll(quantity);
        Coffee_ch.getItems().addAll(quantity);
        Dosa_ch.getItems().addAll(quantity);
        Idli_ch.getItems().addAll(quantity);
        Apple_ch.getItems().addAll(quantity);
        Banana_ch.getItems().addAll(quantity);
        Egg_ch.getItems().addAll(quantity);

        Roti_ch.setOnAction(this::getQuantityRoti);
        Rice_ch.setOnAction(this::getQuantityRice);
        Dal_ch.setOnAction(this::getQuantityDal);
        Egg_ch.setOnAction(this::getQuantityEgg);
        Coffee_ch.setOnAction(this::getQuantityCoffee);
        Dosa_ch.setOnAction(this::getQuantityDosa);
        Idli_ch.setOnAction(this::getQuantityIdli);
        Apple_ch.setOnAction(this::getQuantityApple);
        Banana_ch.setOnAction(this::getQuantityBanana);
    }

    private void getQuantityRoti(javafx.event.ActionEvent actionEvent) {
        roti_qty=Integer.parseInt(Roti_ch.getValue());
       // System.out.println(roti_qty);
    }
    private void getQuantityRice(javafx.event.ActionEvent actionEvent) {
        rice_qty = Integer.parseInt(Rice_ch.getValue());
        System.out.println(rice_qty);
    }
    private void getQuantityDal(javafx.event.ActionEvent actionEvent) {
        dal_qty=Integer.parseInt(Dal_ch.getValue());
        System.out.println(dal_qty);
    }
    private void getQuantityApple(javafx.event.ActionEvent actionEvent) {
        apple_qty=Integer.parseInt(Apple_ch.getValue());
        System.out.println(apple_qty);
    }
    private void getQuantityBanana(javafx.event.ActionEvent actionEvent) {
        banana_qty=Integer.parseInt(Banana_ch.getValue());
        System.out.println(banana_qty);
    }
    private void getQuantityDosa(javafx.event.ActionEvent actionEvent) {
        dosa_qty=Integer.parseInt(Dosa_ch.getValue());
        System.out.println(dosa_qty);
    }
    private void getQuantityIdli(javafx.event.ActionEvent actionEvent) {
        idli_qty=Integer.parseInt(Idli_ch.getValue());
        System.out.println(idli_qty);
    }
    private void getQuantityEgg(javafx.event.ActionEvent actionEvent) {
        egg_qty=Integer.parseInt(Egg_ch.getValue());
        System.out.println(egg_qty);
    }
    private void getQuantityCoffee(javafx.event.ActionEvent actionEvent) {
        coffee_qty=Integer.parseInt(Coffee_ch.getValue());
        System.out.println(coffee_qty);
    }
    public int calcCal() {
        totalcal=(roti_qty*calroti) + (rice_qty*calrice)+ (dal_qty*caldal)+(egg_qty*calegg)+
                (dosa_qty*caldosa)+ (idli_qty*calidli)+(apple_qty*calapple)+(banana_qty*calbanana)+(coffee_qty * calcoffee);
        return totalcal;
    }
   /* public double calBMI(){


        bmi=weight/(sqh*sqh);
       // System.out.println("height sqyured is"+sqh);
        //System.out.println("Weight is"+weight);
        //System.out.println("BMI is"+bmi);
        return bmi;
    }*/
   public void finalscene(ActionEvent event)throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("final.fxml"));
       root= loader.load();
       Final control=loader.getController();
       control.SetCalories(calcCal());
       // USING LAMBDA EXPRESSION TO CALCULATE BMI
       Calculate_Bmi bmi= (height,weight)-> weight/(sqh*sqh);
       control.SetBMI(bmi.calBmi(sqh,weight));

       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setTitle("BMI and Calories");
       stage.setScene(scene);
       stage.show();
   }
}