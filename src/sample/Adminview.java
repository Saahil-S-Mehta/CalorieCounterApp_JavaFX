package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Adminview extends Main implements Initializable {
    int key;
    @FXML
    private TableView<Users> table;
    @FXML
    private TableColumn<Users, String> tablename;

    @FXML
    private TableColumn<Users, String> tableage;

    @FXML
    private TableColumn<Users, String> tableheight;

    @FXML
    private TableColumn<Users, String> tableweight;

    @FXML
    private TableColumn<Users, String> tableuid;
    @FXML
            private Button tablebtn;

   /* void getArrIndex() {
        for (int i = 0; i < 10; i++) {
            if (arr[i][0] == null) {
                key = i;
                break;
            }
        }
    }*/

    // void ListSet(int key) {
    //int i = 0;
    //  while(i!=key)

    //{
  //  ObservableList<Users>  t(){
   public ObservableList<Users> getProduct(){
        ObservableList<Users> list = FXCollections.observableArrayList();
        list.add(new Users(arr[0][0],arr[0][1],arr[0][2],arr[0][3],arr[0][4]));
       list.add(new Users(arr[1][0],arr[1][1],arr[1][2],arr[1][3],arr[1][4]));
       list.add(new Users(arr[2][0],arr[2][1],arr[2][2],arr[2][3],arr[2][4]));
        return list;
    }
         //   ObservableList<Users> list = FXCollections.observableArrayList(
          //          new Users(arr[0][0], arr[0][1], arr[0][2], arr[0][3], arr[0][4]),
          //          new Users(arr[1][0], arr[1][1], arr[1][2], arr[1][3], arr[1][4])
          //  );


       // return list;
//}//
   // }
   //}
   // table.setItems(getProduct());
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablename.setCellValueFactory(new PropertyValueFactory<Users,String>("tablename"));
        tableage.setCellValueFactory(new PropertyValueFactory<Users,String>("tableage"));
        tableheight.setCellValueFactory(new PropertyValueFactory<Users,String>("tableheight"));
        tableweight.setCellValueFactory(new PropertyValueFactory<Users,String>("tableweight"));
        tableuid.setCellValueFactory(new PropertyValueFactory<Users,String>("tableuid"));
        table.setItems(getProduct());
       // table.getColumns().addAll(tablename,tableage,tableheight,tableweight,tableuid);
    }

    private void tablebtn(javafx.event.ActionEvent actionEvent) {
       // table.setItems(list);
    }
}
