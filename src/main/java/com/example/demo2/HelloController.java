package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class HelloController {
    @FXML
    private Button kurkuma_min;
    @FXML
    private Button kurkuma_plus;
    @FXML
    private Label kurkuma_text;

    double i=0.0;



    public void kurkuma_min(ActionEvent actionEvent) {
        i-=0.5;
        kurkuma_text.setText(String.valueOf(i));
    }

    public void kurkuma_(ActionEvent actionEvent) {
        i+=0.5;
        kurkuma_text.setText(String.valueOf(i));
    }
}