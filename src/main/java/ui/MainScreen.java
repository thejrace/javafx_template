package ui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainScreen extends Application {

    public static Stage Stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/main_screen.fxml"));
            Parent content = loader.load();
            primaryStage.setTitle("Obarey");

            primaryStage.setScene(new Scene(content, 1280, 1024 ));

            Stage = primaryStage;
            primaryStage.show();

            primaryStage.setOnCloseRequest(ev -> {
                Platform.exit();
                System.exit(0);
            });

        } catch( Exception e ){
            e.printStackTrace();
        }
    }
}