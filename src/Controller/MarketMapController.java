package Controller;



import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MarketMapController{
    
    @FXML
    Button homeButton, listButton, prodinfoButton, marketmapButton, scanButton, exitButton;

    @FXML
    AnchorPane anchor;
    
 

    
  
    private Scene scene;
    private Stage stage;
 
    
    public void switchToHome(ActionEvent event) throws IOException{
        marketmapButton.setDisable(false);
        homeButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomeScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToShoppingList(ActionEvent event) throws IOException{
        marketmapButton.setDisable(false);
        listButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ListScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProductInfo(ActionEvent event) throws IOException{
        marketmapButton.setDisable(false);
        prodinfoButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ProductInfoScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScan(ActionEvent event) throws IOException{
        marketmapButton.setDisable(false);
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
    
    
}
