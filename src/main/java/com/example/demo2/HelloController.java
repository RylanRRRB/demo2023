package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;


public class HelloController {
    public ToggleButton PrivZichtbaarheidButton;
    public ToggleButton PubZichtbaarheidButton;
    @FXML
    private Button categorieEenMinButton;
    @FXML
    private Button categorieEenPlusButton;
    @FXML
    private Label categorieEenGramText;


    @FXML
    private Button categorieTweeMinButton;
    @FXML
    private Button categorieTweePlusButton;
    @FXML
    private Text categorieTweeGramText;


    @FXML
    private Button categorieDriePlusButton;
    @FXML
    private Button categorieDrieMinButton;
    @FXML
    private Text categorieDrieGramText;


    double i = 0.0;
    double i2 = 0.0;
    boolean isReceptPubliek = false;




    public void categorieEenMinButtonAction(ActionEvent actionEvent) {
        if (i > 0.0) {
            categorieEenMinButton.setDisable(false);
            i -= 0.5;
            categorieEenGramText.setText(String.valueOf(i));
        }
    }

    public void categorieEenPlusButtonAction(ActionEvent actionEvent) {
        i += 0.5;
        categorieEenGramText.setText(String.valueOf(i));
    }

    public void categorieTweeMinButtonAction(ActionEvent actionEvent) {
        if (i2 > 0.0) {
            categorieTweeMinButton.setDisable(false);
            i2 -= 0.5;
            categorieTweeGramText.setText(String.valueOf(i2));
        }
    }

    public void categorieTweePlusButtonAction(ActionEvent actionEvent) {
        i2 += 0.5;
        categorieTweeGramText.setText(String.valueOf(i2));
    }

    public void categorieDrieMinButtonAction(ActionEvent actionEvent) {
        if (i2 > 0.0) {
            categorieDrieMinButton.setDisable(false);
            i2 -= 0.5;
            categorieDrieGramText.setText(String.valueOf(i2));
        }
    }
    public void categorieDriePlusButtonAction(ActionEvent actionEvent) {
        i2 += 0.5;
        categorieDrieGramText.setText(String.valueOf(i2));
    }

    public void PubZichtbaarheidButtonAction(ActionEvent actionEvent) {
        PrivZichtbaarheidButton.setSelected(false);
        isReceptPubliek = true;
        PubZichtbaarheidButton.setStyle("-fx-background-color:gray");
        PrivZichtbaarheidButton.setStyle("-fx-background-color:red");
    }

    public void PrivZichtbaarheidButtonAction(ActionEvent actionEvent) {
        PubZichtbaarheidButton.setSelected(false);
        isReceptPubliek = false;
        PubZichtbaarheidButton.setStyle("-fx-background-color:red");
        PrivZichtbaarheidButton.setStyle("-fx-background-color:gray");
    }
}
