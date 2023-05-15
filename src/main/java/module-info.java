module com.example.exercice4correction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercice4correction to javafx.fxml;
    exports com.example.exercice4correction;
}