package Controller;



import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import Core.Checklist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ListController implements Initializable {
    
    @FXML
    Button homeButton, listButton, prodinfoButton, marketmapButton, scanButton, exitButton;

    @FXML
    AnchorPane anchor;

    @FXML
    TableView<Checklist> checkListTable;

    @FXML
    TableColumn<Checklist, String> productNameCol;
    @FXML
    TableColumn<Checklist, String> brandCol;
    @FXML
    TableColumn<Checklist, Double> costCol;
    @FXML
    TableColumn<Checklist, String> locationCol;
    @FXML
    TableColumn<Checklist, Double> incartCol;

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs =null;
    Checklist checkList = null;
    
    private Scene scene;
    private Stage stage;
 
    
    public void switchToHome(ActionEvent event) throws IOException{
        listButton.setDisable(false);
        homeButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomeScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProductInfo(ActionEvent event) throws IOException{
        listButton.setDisable(false);
        prodinfoButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ProductInfoScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMarketMap(ActionEvent event) throws IOException{
        listButton.setDisable(false);
        marketmapButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/MarketMapScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScan(ActionEvent event) throws IOException{
        listButton.setDisable(false);
        scanButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ScanScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exitButton(ActionEvent event) throws IOException{
        stage = (Stage) anchor.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
