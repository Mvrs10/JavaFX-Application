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
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;

public class JavaFX extends Application{
	// Override the start method of the Application class
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("COMP-228 Lab4 JavaFX - Minh Khoi Phan");
		// Create the root container - Flow Pane
		BorderPane rootBP = createRootBorderPane();
		// Create the top container - HBox
		HBox topHbox = createHBox();
		// Populate content
		rootBP.setTop(topHbox);
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
	// Root Container function
	private BorderPane createRootBorderPane() {
		// Instantiate a flow pane
		BorderPane bp = new BorderPane();
		// Set properties
		
		
		return bp;
	}
	// Top Container function
	private HBox createHBox() {
		// Instantiate an HBox
		HBox hbox = new HBox();
		// Set properties
		hbox.setPadding(new Insets(20, 0, 20, 0));
		// Set content
		Label header = new Label("Student Registration Form");
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		hbox.getChildren().add(header);	
		hbox.setAlignment(Pos.BASELINE_CENTER); // Center alignment
		return hbox;
	}

}
