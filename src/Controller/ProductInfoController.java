package Controller;



import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Core.InventoryList;
import Core.ProductInventory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ProductInfoController implements Initializable {
    
    @FXML
    Button homeButton, listButton, prodinfoButton, marketmapButton, scanButton, exitButton;

    @FXML
    AnchorPane anchor;

    @FXML
    TextField searchTextField;

    ObservableList<ProductInventory> productInventoryObservableList = FXCollections.observableArrayList();

    private Scene scene;
    private Stage stage;
 
    
    public void switchToHome(ActionEvent event) throws IOException{
        prodinfoButton.setDisable(false);
        homeButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomeScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToShoppingList(ActionEvent event) throws IOException{
        prodinfoButton.setDisable(false);
        listButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ListScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMarketMap(ActionEvent event) throws IOException{
        prodinfoButton.setDisable(false);
        marketmapButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/MarketMapScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScan(ActionEvent event) throws IOException{
        prodinfoButton.setDisable(false);
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
        productInventoryObservableList = InventoryList.importDB();


    }
}
