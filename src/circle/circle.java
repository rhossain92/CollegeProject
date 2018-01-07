package circle;

/***Programmer: Redwan Hossain
* Description : Recurring circle
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circle extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise18_20");
		primaryStage.setScene(scene);
		primaryStage.show();

		Compare(pane.getHeight() - 25, pane.getWidth() - 25, pane);
		pane.heightProperty().addListener(e -> Compare(pane.getHeight() - 25, pane.getWidth() - 25, pane));
		pane.widthProperty().addListener(e -> Compare(pane.getHeight() - 25, pane.getWidth() - 25, pane));

	}

	private void Compare(double height, double width, StackPane pane) {

		pane.getChildren().clear();

		if (height >= width) {
			displayCircles(width, pane);
		} else {
			displayCircles(height, pane);
		}
	}

	private void displayCircles(double radius, StackPane pane) {
		if (radius >= 10) {
			double arg = Math.floor(radius / 10) * 5;
			Circle c = new Circle(radius);
			c.setFill(Color.WHITE);
			c.setStroke(Color.BLACK);
			c.setRadius(arg);
			c.centerXProperty();
			c.centerYProperty();
			pane.getChildren().add(c);
			radius -= 10;
			displayCircles(radius, pane);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
