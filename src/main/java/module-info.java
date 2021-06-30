module be.ac.umons {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens be.ac.umons to javafx.fxml;
    exports be.ac.umons;
}