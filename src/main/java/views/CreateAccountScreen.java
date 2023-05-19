package views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateAccountScreen extends Application {
        private TextField usernameField;
        private TextField passwordField;
        private  TextField mailField;
    public void show(Stage stage) {
        stage.setTitle("Wild Life Watchers - Crear Cuenta");

        Label usernameLabel = new Label("Nombre:");
        Label mailLabel = new Label("Correo:");
        Label passwordLabel = new Label("Contraseña:");

        usernameField = new TextField();
        passwordField = new TextField();
        mailField = new TextField();

        Button loginButton = new Button("Regresar");
        Button createAccountButton = new Button("Crear cuenta");

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, createAccountButton);

        Scene scene = new Scene(root, 1400, 700);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
