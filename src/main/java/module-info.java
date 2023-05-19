module com.example.williifewatchers {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens views to javafx.fxml;
    exports views;
    exports controlers;
    opens controlers to javafx.fxml;
}