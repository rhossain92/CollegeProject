package pan;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Pane extends Application {

	private static final String Hbox = null;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {

		// Setup a tab pane, disallowing tab closing
		TabPane tp = new TabPane();
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		// Create 4 tab for buttons 
		Tab buttons_tab = new Tab("Add dorm Building");
		Tab buttons_tab1 = new Tab("Add room");
		Tab buttons_tab2 = new Tab("Assign student");
		Tab buttons_tab3 = new Tab("Report");
		//buttons_tab.contentProperty("Button1");
		// Define two buttons and put them in an HBox  // Have to fix here
				Button b1 = new Button("Button 1");
				Button b2 = new Button("Button 2");
				HBox hb = new HBox();
				hb.getChildren().addAll(b1, b2);
				hb.setPadding(new Insets(20));
				hb.setSpacing(20);
				
				// Add the HBox to the buttons tab
				buttons_tab.setContent(hb);
		
	
		// Add both tabs to the tab pane
		tp.getTabs().addAll(buttons_tab, buttons_tab1, buttons_tab2,
				buttons_tab3);

		// Setup the scene and the stage
		Scene scene = new Scene(tp);
		stage.setTitle("Tab Pane Demo");
		stage.setX(400);
		stage.setY(100);
		stage.setHeight(500);
		stage.setWidth(600);
		stage.setScene(scene);
		stage.show();
	}
}