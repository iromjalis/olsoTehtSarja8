module com.example.olsotehtsarja8 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.olsotehtsarja8 to javafx.fxml;
    exports com.example.olsotehtsarja8;
}