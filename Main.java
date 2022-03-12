import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(createContext());
        stage.setScene(scene);
        stage.show();
    }

    private Parent createContext() {
        return new Pane();
    }

    public static void main(String[] args) {
        launch(args);
    }
}