package com.example.dob;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {
    @FXML
    Stage stage;
    Scene scene;
    Parent root;
    static int date = 0;
    @FXML
    Text tf = new Text();

    @FXML
    void n1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Main.class.getResource("second-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void y1(ActionEvent event) throws IOException {
        date = date + 1;
        root = FXMLLoader.load(Main.class.getResource("second-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void n2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Main.class.getResource("third-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void y2(ActionEvent event) throws IOException {
        date = date + 2;
        root = FXMLLoader.load(Main.class.getResource("third-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void n3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Main.class.getResource("fourth-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void y3(ActionEvent event) throws IOException {
        date = date + 4;
        root = FXMLLoader.load(Main.class.getResource("fourth-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void n4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Main.class.getResource("fifth-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void y4(ActionEvent event) throws IOException {
        date = date + 8;
        root = FXMLLoader.load(Main.class.getResource("fifth-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void n5(ActionEvent event) throws IOException {
        System.out.println(date);
        root = FXMLLoader.load(Main.class.getResource("final-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void y5(ActionEvent event) throws IOException {
        date = date + 16;
        System.out.println(date);
        root = FXMLLoader.load(Main.class.getResource("final-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tf.setText("Your birthdate is " + date + " of some month in the calender");
    }

    @FXML
    void p1(ActionEvent event) throws IOException {
        date = 0;
        root = FXMLLoader.load(Main.class.getResource("first-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void q1(ActionEvent event) {
        System.exit(0);
    }
}

