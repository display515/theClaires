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
        Label statusLabel = new Label("JavaFX Graphics Subsystem: Connected");
        yearnButton = new Button();
        yearnButton.setText("Yes");
        statusLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green; -fx-font-weight: bold;");
        
        Scene scene = new Scene(new StackPane(statusLabel), 450, 200);
        yearnStageInterface.setScene(scene);
        yearnStageInterface.setTitle("Yearn Window Subsystem");
        yearnStageInterface.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
