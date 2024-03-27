package main;

import javafx.application.*;
import javafx.stage.*;
import javafx.fxml.*;
import javafx.scene.*;

public class Main extends Application
{
    public Stage loginFailStage;
    public Stage primaryStage;
    
    public Main() {
        this.loginFailStage = new Stage();
        this.primaryStage = new Stage();
    }
    
    @Override
    public void start(final Stage primarStage) {
        try {
            final Parent root = FXMLLoader.load(this.getClass().getResource("Login.fxml"));
            this.primaryStage.setTitle("Login");
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
            this.primaryStage.setResizable(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void loginFail() {
        try {
            final Parent loginFailRoot = FXMLLoader.load(this.getClass().getResource("LoginFailMessage.fxml"));
            this.loginFailStage.setTitle("Invalid Login");
            this.loginFailStage.setScene(new Scene(loginFailRoot));
            this.loginFailStage.show();
            this.loginFailStage.setResizable(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void openApp() {
        final Stage AppletStage = new Stage();
        try {
            final Parent AppletMainRoot = FXMLLoader.load(this.getClass().getResource("AppletMain.fxml"));
            AppletStage.setTitle("Redux Launcher");
            AppletStage.setScene(new Scene(AppletMainRoot));
            AppletStage.setResizable(false);
            AppletStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        Application.launch(args);
    }
}
