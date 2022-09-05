package sample;

import javafx.beans.property.SimpleStringProperty;

public class Users {
    private SimpleStringProperty tablename,tableage,tableheight,tableweight,tableuid;
  /*  private String tableage;
    private String tableheight;
    private String tableweight;
    private String tableuid;*/
    public Users(String tablename, String tableage, String tableheight, String tableweight, String tableuid)
    {
        this.tablename= new SimpleStringProperty(tablename);
        this.tableage= new SimpleStringProperty(tableage);
        this.tableheight= new SimpleStringProperty(tableheight);
        this.tableweight= new SimpleStringProperty(tableweight);
        this.tableuid= new SimpleStringProperty(tableuid);
    }

    public String getTablename() {
       return tablename.get();
    }
    public void setTablename(SimpleStringProperty tablename){
        this.tablename=tablename;
    }
    public String getTableage() {
        return tableage.get();
    }
    public void setTableage(SimpleStringProperty tableage){
        this.tableage=tableage;
    }
    public String getTableheight() {
        return tableheight.get();
    }
    public void setTableheight(SimpleStringProperty tableheight){
        this.tableheight=tableheight;
    }
    public String getTableweight() {
        return tableweight.get();
    }
    public void setTableweight(SimpleStringProperty tableweight){
        this.tableweight=tableweight;
    }
    public String getTableuid() {
        return tableuid.get();
    }
    public void setTableuid(SimpleStringProperty tableuid){
        this.tableuid=tableuid;
    }
}
