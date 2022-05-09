package Controller;



import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HomeController implements Initializable{
    @FXML
    Button homeButton, listButton, prodinfoButton, marketmapButton, scanButton, exitButton;

    @FXML
    AnchorPane anchor;

  
    @FXML
    ImageView sampleImg;

    private Scene scene;
    private Stage stage;

    int count;
 
    public void switchToShoppingList(ActionEvent event) throws IOException{
        homeButton.setDisable(false);
        listButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ListScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProductInfo(ActionEvent event) throws IOException{
        homeButton.setDisable(false);
        prodinfoButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ProductInfoScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMarketMap(ActionEvent event) throws IOException{
        homeButton.setDisable(false);
        marketmapButton.setDisable(true);
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/MarketMapScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScan(ActionEvent event) throws IOException{
        homeButton.setDisable(false);
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

    private void homeSlide(){
        ArrayList<Image> images = new ArrayList<Image>();
        images.add(new Image("D:\\Coding\\01_Java\\ShoppingApp\\ShoppingApp\\src\\Image\\image1.jpg"));
        images.add(new Image("D:\\Coding\\01_Java\\ShoppingApp\\ShoppingApp\\src\\Image\\image2.jpg"));
        images.add(new Image("D:\\Coding\\01_Java\\ShoppingApp\\ShoppingApp\\src\\Image\\image3.jpg"));
        
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), e ->{
            System.out.println("5s na");

            sampleImg.setImage(images.get(count));
            count++;
            if (count == 3){
                count = 0;
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        homeSlide();
        
    }
    
}
