import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class App extends Application {

    Button yearnButton;

    @Override
    public void start(Stage yearnStageInterface) throws Exception {
        yearnStageInterface.setTitle("Yearn");
        
        yearnStageInterface.setScene(scene);
        yearnStageInterface.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
