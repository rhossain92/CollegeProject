

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

	public class DormRoomSystem extends Application {
		Button b1,b2,b3,b4,b5,b6;
		Connection connection;
		@Override
		public void start(Stage stage) {
			
			// Setup a tab pane, disallowing tab closing
			TabPane tp = new TabPane();
			tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
			
			// Create a tab for buttons
			Tab tab1 = new Tab("Add_Dorm_Building");
			Tab tab2 = new Tab("Add_Dorm_Room");
			Tab tab3 = new Tab("Assing_StudentTo_Dorm");
			Tab tab4 = new Tab("Report");
			
			//Create HBox and VBox for tabs
			HBox hb = new HBox();
			HBox hb1 = new HBox();
			HBox hb2 = new HBox();
			VBox vb = new VBox();
			
			//Define TextField and button for tab1
			TextField text = new TextField();
		    text.setPromptText("Enter a Dorm Building");
			b1 = new Button("Add_Building");
			hb.getChildren().addAll(text,b1);
			hb.setPadding(new Insets(20));
			hb.setSpacing(20);
			
			//Define TextField and button for tab1
			TextField text1 = new TextField();
			b2 = new Button("AddRoom");
			hb1.getChildren().addAll(text1, b2);
			hb1.setPadding(new Insets(20));
			hb1.setSpacing(20);
			
			//Define TextField and button for tab3
			TextField text2 = new TextField();
			TextField text3 = new TextField();
			Button b3 = new Button("AddName_AndId");
			hb2.getChildren().addAll(text2,text3, b3);
			hb2.setPadding(new Insets(20));
			hb2.setSpacing(20);
			
			//Define buttons for tab4 
			b4 = new Button("ClickForDormRoomPlusBuilding");
			b5 = new Button("ClickForAllStudent");
			b6 = new Button("ClickForStudentPlusDormRoom");
			vb.setPadding(new Insets(20));
			vb.setSpacing(20);
			vb.getChildren().addAll(b4,b5,b6);
			
			// Add the HBox to the buttons tab
			tab1.setContent(hb);
			tab2.setContent(hb1);
			tab3.setContent(hb2);
			tab4.setContent(vb);

			// Add both tabs to the tab pane
			tp.getTabs().addAll(tab1, tab2,tab3,tab4);
			
			//Create Event handler
			MyHandler myHandler = new MyHandler();
			
			//Set button on action
			b1.setOnAction(myHandler);
			b2.setOnAction(myHandler);
			//b3.setOnAction(myHandler);
			b4.setOnAction(myHandler);
			b5.setOnAction(myHandler);
			b6.setOnAction(myHandler);
			
			// Setup the scene and the stage
			Scene scene = new Scene(tp);
			stage.setTitle("Dorm Room System");
			stage.setX(400);
			stage.setY(100);
			stage.setHeight(500);
			stage.setWidth(600);
			stage.setScene(scene);
			stage.show();
		}
		
		// Handler defined as an inner class
		class MyHandler implements EventHandler<ActionEvent> {
			@Override
			public void handle(ActionEvent e) {
				if (e.getSource()==b1){
				
				}
			}
		}
		
    public class database {
    	public void main(String[] args) throws SQLException {
    		connection = DriverManager.getConnection
					("jdbc:ucanaccess://z:/CollegeDorm.accdb");
    	}
    }
    
    
	public static void main(String[] args) {
		Application.launch(args);
	}
	}

