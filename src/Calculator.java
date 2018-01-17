//Author: Redwan Hossain
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

	Button btAdd, btSubtract,btMultiply,btDivision;
	@Override
	public void start(Stage primaryStage) {	
		
		// First text field
		HBox pane2 = new HBox();
		pane2.setAlignment(Pos.CENTER);
		TextField tfArg1 = new TextField();
		tfArg1.setPromptText("Enter First input");
		//Operator Label
		Label lbOP = new Label(" Op ");	
		
		// Second text Field
		TextField tfArg2 = new TextField();
		Button btResult = new Button(" = Result");
		
		//TextField tfResult = new TextField();
		pane2.getChildren().addAll(tfArg1,lbOP,tfArg2,btResult);
		
		HBox pane3 = new HBox(5);
		pane3.setAlignment(Pos.CENTER);
		
		btAdd = new Button(" + ");
		btSubtract = new Button(" - ");
		btMultiply = new Button(" * ");
	    btDivision = new Button(" / ");
		
		pane3.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivision);
		VBox pane4 = new VBox(20);
		pane4.setAlignment(Pos.CENTER);
		pane4.setStyle(" -fx-padding: 20; -fx-font-size: 10;-fx-pane-size: 40");
		pane4.getChildren().addAll(pane2,pane3);
		
		btAdd.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent e) {
				if(e.getSource()==btAdd)
				lbOP.setText("+");
			}
		});
		
		
		//Put the pane in the scene
		Scene scene1 = new Scene(pane4,300,300);
		// Set the stage up, put the scene on the stage and show it
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene1);
		primaryStage.show();	
	}

	
	public static void main(String[] args) {
		Application.launch(args);
	}
}