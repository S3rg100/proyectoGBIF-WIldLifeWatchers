package controlers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ControladorLogin extends Application {

        private String UserName;

        private String UserPassword;

    public int verificarValues (String Uname) throws IOException {
        int opcion = 0;

        if (Uname.equalsIgnoreCase("usuario")){
            opcion = 1;
        } else if (Uname.equalsIgnoreCase("experto")){
            opcion = 2;
        } else if (Uname.equalsIgnoreCase("administrador")) {
            opcion = 3;
        }

        return opcion;
    }

    public void ControladorLogin (){
        this.UserName ="";
        this.UserPassword ="";
    }

    @Override
    public void start(Stage stage) {
    }
}