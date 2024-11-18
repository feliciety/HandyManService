module project.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.demo to javafx.fxml;
    exports project.demo;
}