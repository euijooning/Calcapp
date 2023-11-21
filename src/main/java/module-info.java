module app.calcapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.calcapp to javafx.fxml;
    exports app.calcapp;
}