package comp228_mkp_lab4_exercise1;
/**
 * @author Minh Khoi Phan-301278135
 * @since 2024-11-4
 * @implNote Lab #4 Using JavaFX
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class JavaFX extends Application{
	// Override the start method of the Application class
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("COMP-228 Lab4 JavaFX - Minh Khoi Phan");
		// Create a root container - Flow Pane
		BorderPane rootBP = createRootBorderPane();
		// Create a scene
		Scene scene = new Scene(rootBP, 800, 600);
		// Set scene
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args)
	{
		launch();
	}
	// Container function
	private BorderPane createRootBorderPane() {
		// Instantiate a flow pane
		BorderPane bp = new BorderPane();
		// Set properties
		
		
		return bp;
	}

}
