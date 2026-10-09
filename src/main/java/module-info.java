module com.example.damnbignumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.damnbignumbers to javafx.fxml;
    exports com.example.damnbignumbers;
}