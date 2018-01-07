package Makingcircle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
 public class Exercise18_20 extends Application {

	@Override
	public void start(Stage primaryStage) {
		 //int Radius = 150;
		 
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.setCenterX(300);
		 circle.setCenterY(300);
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		
		circle.setRadius(150);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.AQUA);
		
		
		
		
		
		pane.getChildren().add(circle);			
		Scene scene = new Scene(pane, 310, 310);


		// primaryStage.setTitle("Draw Circle at Fixed Position");
		primaryStage.setTitle("Draw Circle Centered in the Window");
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

	