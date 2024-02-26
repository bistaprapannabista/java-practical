import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Lab23 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Click Me!");

        // Add event handler to the button
        button.setOnAction(e -> {
            System.out.println("Button Clicked!");
        });

        // Create a layout pane and add the button to it
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Create a scene
        Scene scene = new Scene(root, 300, 200);

        // Set the scene on the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Event Handling Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
