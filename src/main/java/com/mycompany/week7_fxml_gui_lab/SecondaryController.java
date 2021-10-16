package com.mycompany.week7_fxml_gui_lab;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SecondaryController {
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;
     
    @FXML
    private Button rBtn;
    
    @FXML
    private Label errorLabel;
    
    @FXML
    private Label counter;

    @FXML
    private ImageView myImageView;
    
    int count = 0;
    
    @FXML
    private void displayFirstImage() throws IOException {
        int x = Integer.parseInt(counter.getText());
        if (count < 2){
            Image myImage1 = new Image("/pics/wolf.png");
            myImageView.setImage(myImage1);
            count = 1;
            count = x + count;
            counter.setText("" +  count);
        }
        else{
            errorLabel.setText("Cannot Change Image, Max Count Reached");
        }
        
    }
    
    @FXML
    private void displaySecondImage() throws IOException {
        int y = Integer.parseInt(counter.getText());
        if (count < 2){
            Image myImage2 = new Image("/pics/wolf2.png");
            myImageView.setImage(myImage2);
            count = 1;
            count = y + count;
            counter.setText("" +  count);
        }
        else{
            errorLabel.setText("Cannot Change Image, Max Count Reached");
        }
    }
    
    @FXML
     private void rotateImage() throws IOException {
        int z = Integer.parseInt(counter.getText());
        
        if (count < 2){
            myImageView.setRotate(90);
            count = 1;
            count = z + count;
            counter.setText("" +  count);
        }
        else{
            errorLabel.setText("Cannot Rotate Image, Max Count Reached");
        }
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}