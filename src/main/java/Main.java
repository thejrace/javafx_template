import javafx.application.Application;
import javafx.stage.Stage;
import ui.MainScreen;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        try {
            MainScreen mainScreen = new MainScreen();
            mainScreen.start( new Stage() );
        } catch( Exception e ) {

        }

    }

    public static void main(String[] args) {
        launch();
    }

}