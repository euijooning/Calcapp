package app.calcapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("design.fxml")); // Assuming "design.fxml" is in the correct package
        stage.setScene(new Scene(root));
        stage.setTitle("Basic 계산기");
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}