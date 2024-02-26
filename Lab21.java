import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lab21 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the rectangle
        Pane root = new Pane();

        // Create a rectangle
        Rectangle rectangle = new Rectangle(50, 50, 100, 80); // x, y, width, height
        rectangle.setFill(Color.BLUE); // Set fill color
        rectangle.setStroke(Color.BLACK); // Set border color

        // Add the rectangle to the pane
        root.getChildren().add(rectangle);

        // Create a scene
        Scene scene = new Scene(root, 300, 200);

        // Set the scene on the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Draw Rectangle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
