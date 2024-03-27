package main;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.event.*;

public class LoginController extends Main
{
    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    
    public void onSubmit(final ActionEvent e) {
        if (this.user.getText().equalsIgnoreCase("Silo") && this.pass.getText().equals("nagol")) {
            this.openApp();
            this.primaryStage.close();
        }
        else {
            this.loginFail();
        }
    }
}
